package ex13;


public class Test {
    public static void main(String args[]){

        //testing 
        //ConsCell
        ConsCell cellA = new ConsCell(1,null);
        ConsCell cellB = new ConsCell(0,null);
        System.out.println(cellA.getHead());
        System.out.println(cellB.getHead());
        //IntList
        ConsCell cellC = new ConsCell(2,cellA);
        ConsCell cellD = new ConsCell(1,cellB);
        IntList listA = new IntList(cellC);
        IntList listB = new IntList(cellD);
        System.out.println(listA.getLast());
        System.out.println(listB.getLast());


    }
}