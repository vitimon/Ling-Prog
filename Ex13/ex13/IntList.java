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
        while (cell != null) { // while not at end of list
            len++;
            cell = cell.getTail();
        }
        return len;
    }
/*
 public IntList append(IntList y){
    int thisHead = this.ConsCell.getHead();
    ConsCell thisTail = this.ConsCell.getTail();
    int yHead = y.ConsCell.getHead();
    ConsCell yTail = y.ConsCell.getTail();



    return IntList(thisHead);
 }*/
}