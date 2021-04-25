package introduction;

public class exception {

	public static void main(String[] args) {
		
		
			fun1();
		}
	static void fun1()
	{
		int a = 5;
		int b = 4;
		
		int c = a/b;
	    System.out.println(c);
	
	    fun2();
	}
	static void fun2() throws ArrayIndexOutOfBoundsException 
	{
		boolean isDanger = true;
	    if(isDanger)
	    {
	    	throw new ArrayIndexOutOfBoundsException("some kind of danger is coming");
	    }
	}
	}
