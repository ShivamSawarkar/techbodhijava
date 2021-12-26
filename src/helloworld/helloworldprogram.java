package helloworld;

public class helloworldprogram {  
	
	public void add()
	{
		System.out.println("add");
		System.out.println("shivam ");
	}
	public int substract()
	{
		int b = 1;
		int a = 2;
		int c=a-b;
		return c;
	}
	
  public static void main( String args []) 
  {
	  helloworldprogram ab=new helloworldprogram ();
	  ab.add();
	  ab.substract();
  }
}