package FirstSamplePackage;

public class NonStaticVariable {
	
	public int x =200 , y=300 ;
	
	public static void main(String[] args)
	{
		NonStaticVariable N = new NonStaticVariable();
		System.out.println(N.x + " " + N.y);
		
	}

}
