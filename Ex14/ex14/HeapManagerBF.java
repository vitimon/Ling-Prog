package ex14;

class HeapManagerBF {
	static private final int NULL = -1; // null link
	public int[] memory; // the memory we manage
	private int freeStart; // start of the free list

	/**
	 * HeapManager constructor.
	 * @param initialMemory int[] of memory to manage
	 */
	public HeapManagerBF(int[] initialMemory) {
		memory = initialMemory;
		memory[0] = memory.length; // one big free block
		memory[1] = NULL; // free list ends with it
		freeStart = 0; // free list starts with it
	}

	/**
	 * Allocate a block and return its address.
	 * @param requestSize int size of block, > 0
	 * @return block address
	 * @throws OutOfMemoryError if no block big enough
	 */
	public int allocate(int requestSize) {
		int size = requestSize + 1; 
		int p = freeStart;
		int lag = NULL;
		int bestLag = NULL;
		int best = NULL;
		int bestSize = 1023;

		while (p!=NULL && bestSize!=size) {
			if ((memory[p] >= size) && (memory[p] < bestSize)){
				best = p;
				bestLag = lag;
				bestSize = memory[p];
			}
			lag = p; 
			p = memory[p+1]; 
		}
		if (p==NULL && best==NULL) 
			throw new OutOfMemoryError();
		
		int nextFree = memory[best+1]; 
		int unused = bestSize-size; 
		if (unused>1) { 
			nextFree = best+size; 
			memory[nextFree] = unused; 
			memory[nextFree+1] = memory[best+1]; 
			memory[best] = size; 
		}

		if (bestLag==NULL) freeStart = nextFree;
		else memory[bestLag+1] = nextFree;
		
		return best+1;
	}

	/**
	 * Deallocate an allocated block.  This works only if the block address is one that was returned by
	 * allocate and has not yet been deallocated.
	 * @param address int address of the block
	 */
	public void deallocate(int address) {
		int addr = address-1; // real start of the block

		// Find the insertion point in the sorted free list for this block.

		int p = freeStart;
		int lag = NULL;
		while (p!=NULL && p<addr) {
			lag = p;
			p = memory[p+1];
		}

		// Now p is the index of the block to come after ours in the free list, or NULL, and lag is the
		// index of the block to come before ours in the free list, or NULL.

		// If the one to come after ours is adjacent to it, merge it into ours and restore the property
		// described above.

		if (addr+memory[addr]==p) {
			memory[addr] += memory[p]; // add its size to ours
			p = memory[p+1]; 
		}
		if (lag==NULL) { // ours will be first free
			freeStart = addr;
			memory[addr+1] = p;
		}
		else 
			if (lag+memory[lag]==addr) { // block before is adjacent to ours
				memory[lag] += memory[addr]; // merge ours into it
				memory[lag+1] = p;
			}
			else { // neither: just a simple insertion
				memory[lag+1] = addr;
				memory[addr+1] = p;
			}
	}

	/**
	 * Prints memory configuration.
	 */
	public void echo() {
		System.out.printf("Memory configuration\n");
		for(int i=memory.length-1; i >=0 ; i--)
			System.out.printf("\t[%d] = %d\n",i,memory[i]);
		System.out.printf("\tfreeStart: %d\n",freeStart);

	}	
}