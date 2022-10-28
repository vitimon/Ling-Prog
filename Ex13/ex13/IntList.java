package ex13;

public class IntList {
    private ConsCell start;
    public IntList(ConsCell s) {
        start = s;
    }

    public IntList cons (int h) {
        return new IntList(new ConsCell(h,start));
    }

    public int length() {
        int len = 0;
        ConsCell cell = start;
        while (cell != null) { 
            len++;
            cell = cell.getTail();
        }
        return len;
    }

    //Metodo para buscar o ultimo item de uma IntList

    public int getLast(){
        ConsCell list = start;
        int currentLast = 0;
        while(list != null){
            currentLast = list.getHead();
            list = list.getTail();
        }
        return currentLast;
    }
    
    //Metodo para buscar o Nésimo item numa IntList
    public int getNth(int index){
        ConsCell list = start;
        int current = 0;
        while(index > 0){
            current = list.getHead();
            if(list == null){return current;}
            list = list.getTail();
            index--;
        }
        return current;
    }

    public IntList append(IntList y){
        ConsCell appendable = y.start;
        int pushSize = this.length();
        while(pushSize > 0){
            appendable =  new ConsCell(this.getNth(pushSize), appendable);
            pushSize--;
        }
        return  new IntList(appendable);
    }

    public IntList appendR(IntList y){
        if(start.getTail() == null){
            return new IntList(new ConsCell(start.getHead(), y.start));
        }
        else{
            ConsCell tail = start.getTail();
            IntList tailList =  new IntList(tail);
            IntList appended = tailList.appendR(y);
            ConsCell stackTail = new ConsCell(start.getHead(),appended.start);
            return new IntList(stackTail);
        }
    }

    //Refatorar!!!!!

}