package ex17;

public class Exercise17{
  public static void main(String[] args) {

    Tries singleTry = new Tries();

    System.out.printf("Test A\n\n");

    try{
      singleTry.tryA();
    }
    catch(Throwable e){
      System.out.printf(e.getMessage());
    }

    System.out.printf("Test B\n\n");

    try{
      singleTry.tryB();
    }
    catch(Throwable e){
      System.out.printf(e.getMessage());
    }

    System.out.printf("Test C\n\n");

    try{
      singleTry.tryC();
    }
    catch(Throwable e){
      System.out.printf(e.getMessage());
    }


     }
}