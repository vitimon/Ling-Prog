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

    //Metodo para buscar o ultimo item de uma int list

    public int getLast(){
        ConsCell list = start;
        int currentLast = 0;
        while(list != null){
            currentLast = list.getHead();
            list = list.getTail();
        }
        return currentLast;
    }

    

    //METODOS TILT AINDA, SERÁ QUE TENHO QUE CRIAR UM TERCEIRO METODO PRA BUSCAR O ULTIMO ITEM?
    /*
    public IntList append(IntList y){
        ConsCell list1 = this.start;
        ConsCell list2 = y.start;
        ConsCell listR = null;
    

        return IntList(list1.getHead());
    }
    public IntList appendR(IntList y){
        ConsCell appended = null

    }*/

}