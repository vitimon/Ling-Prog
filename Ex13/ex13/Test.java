package ex13;


public class Test {
    public static void main(String args[]){

        //testing 
        //ConsCell
        System.out.println("ConsCell test");
        ConsCell cellA = new ConsCell(1,null);
        ConsCell cellB = new ConsCell(0,null);
        System.out.println(cellA.getHead());
        System.out.println(cellB.getHead());
        //IntList
        System.out.println("IntList test");
        ConsCell cellC = new ConsCell(2,cellA);
        ConsCell cellD = new ConsCell(1,cellB);
        IntList listA = new IntList(cellC);
        IntList listB = new IntList(cellD);
        System.out.println(listA.getLast());
        System.out.println(listB.getLast());
        //Length
        System.out.println("LengthMethod test");
        System.out.println(listA.length());
        System.out.println(listB.length());
        //Get Nth
        System.out.println("GetNth test");
        System.out.println(listA.getNth(2));
        System.out.println(listB.getNth(1));
        //append
        System.out.println("Append test");
        IntList listC = listA.append(listB);
        System.out.println(listC.getNth(1));
        System.out.println(listC.getNth(2));
        System.out.println(listC.getNth(3));
        System.out.println(listC.getNth(4));
        //System.out.println(listC.getNth(5)); //              Vai da Erro
        //appendR
        System.out.println("AppendR test")

    }
}