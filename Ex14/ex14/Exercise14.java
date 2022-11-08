package ex14;

public class Exercise14{
  public static void main(String[] args) {
    System.out.printf("Test B\n\n");

    HeapManagerBF m = new HeapManagerBF(new int[7]);
	HeapManager mm = new HeapManager(new int[7]);

    int p1, p2, p3, p4, p5, q1, q2, q3, q4, q5;

    m.echo();
	mm.echo();

	p1=m.allocate(2);
	System.out.printf("\np1 = %d, size = %d\n",p1,2);
	m.echo();

	q1=mm.allocate(2);
	System.out.printf("\nq1 = %d, size = %d\n",q1,2);
	mm.echo();

	p2=m.allocate(1);
	System.out.printf("\np2 = %d, size = %d\n",p2,1);
	m.echo();

	q2=mm.allocate(1);
	System.out.printf("\nq2 = %d, size = %d\n",q2,1);
	mm.echo();

	p3=m.allocate(1);
	System.out.printf("\np3 = %d, size = %d\n",p3,1);
	m.echo();

	q3=mm.allocate(1);
	System.out.printf("\nq3 = %d, size = %d\n",q3,1);
	mm.echo();

	m.deallocate(p1);
	System.out.printf("\nDeallocating p1\n");
	m.echo();

	mm.deallocate(q1);
	System.out.printf("\nDeallocating q1\n");
	mm.echo();

	m.deallocate(p3);
	System.out.printf("\nDeallocating p3\n");
	m.echo();

	mm.deallocate(q3);
	System.out.printf("\nDeallocating q3\n");
	mm.echo();

	p4=m.allocate(1);
	System.out.printf("\np4 = %d, size = %d\n",p4,1);
	m.echo();

	q4=mm.allocate(1);
	System.out.printf("\nq4 = %d, size = %d\n",q4,1);
	mm.echo();

	p5=m.allocate(2);
	System.out.printf("\np5 = %d, size = %d\n",p5,2);
	m.echo();

	/*
	ERROR ON FIRST-FIT

	q5=mm.allocate(2);
	System.out.printf("\nq5 = %d, size = %d\n",q5,2);
	mm.echo();
	*/

    System.out.printf("\nEndTest\n\n");
	System.out.printf("Test C\n\n");

	HeapManagerBF n = new HeapManagerBF(new int[11]);
	HeapManager nn = new HeapManager(new int[11]);

	int r1, r2, r3, r4, r5, r6, s1, s2, s3, s4, s5, s6;

	n.echo();
	nn.echo();

	r1=n.allocate(4);
	System.out.printf("\nr1 = %d, size = %d\n",r1,4);
	n.echo();

	s1=nn.allocate(4);
	System.out.printf("\ns1 = %d, size = %d\n",s1,4);
	nn.echo();

	r2=n.allocate(1);
	System.out.printf("\nr2 = %d, size = %d\n",r2,1);
	n.echo();

	s2=nn.allocate(1);
	System.out.printf("\ns2 = %d, size = %d\n",s2,1);
	nn.echo();

	r3=n.allocate(3);
	System.out.printf("\nr3 = %d, size = %d\n",r3,3);
	n.echo();

	s3=nn.allocate(3);
	System.out.printf("\ns3 = %d, size = %d\n",s3,3);
	nn.echo();

	n.deallocate(r1);
	System.out.printf("\nDeallocating r1\n");
	n.echo();

	nn.deallocate(s1);
	System.out.printf("\nDeallocating s1\n");
	nn.echo();

	n.deallocate(r3);
	System.out.printf("\nDeallocating r3\n");
	n.echo();

	nn.deallocate(s3);
	System.out.printf("\nDeallocating s3\n");
	nn.echo();

	r4=n.allocate(1);
	System.out.printf("\nr4 = %d, size = %d\n",r4,1);
	n.echo();

	s4=nn.allocate(1);
	System.out.printf("\ns4 = %d, size = %d\n",s4,1);
	nn.echo();

	r5=n.allocate(2);
	System.out.printf("\nr5 = %d, size = %d\n",r5,2);
	n.echo();

	s5=nn.allocate(2);
	System.out.printf("\ns5 = %d, size = %d\n",s5,2);
	nn.echo();
	/*
	ERROR ON BEST-FIT

	r6=n.allocate(3);
	System.out.printf("\nr6 = %d, size = %d\n",r6,3);
	n.echo();
	*/
	s6=nn.allocate(3);
	System.out.printf("\ns6 = %d, size = %d\n",s6,3);
	nn.echo();

	System.out.printf("\nEndTest\n");
  }
}