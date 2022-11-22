package ex17;

public class Tries{

	public Tries(){
	}

	public void tryA() throws Exception{
		try{
			System.out.printf("try A works fine\n");
		}
		catch(Throwable e){
			System.out.printf(e.getMessage());
		}
		finally{
			throw new Exception("forced error in 'finally A'\n\n");
		}

	}

	public void tryB() throws Exception, Throwable{
		try{
			System.out.printf("try B works fine and throws a Throwable\n");
			throw new Throwable("Forced error in 'try B'\n\n");
		}
		catch(Exception e){
			System.out.printf(e.getMessage());
		}
		finally{
			System.out.printf("'finally B' works fine\n");
		}

	}

	public void tryC() throws Exception{
		try{
			System.out.printf("try C works fine and throws a Excesption\n");
			throw new Exception("Forced error in 'try C'");
		}
		catch(Exception e){
			System.out.printf(e.getMessage() + "...but catched\n");
			throw new Exception("Forced error in 'catch C'\n\n");
		}
		finally{
			System.out.printf("'finally C' works fine\n");
		}

	}





}