package FirstSamplePackage;

public class MethodsWithArguments {
	
	public MethodsWithArguments()
	{
		System.out.println("Constructor for the Object M has been Created.");
	}
	public static void MethodWithArg2(int b)
	{
		int bb;
		bb=b;
		System.out.println("Static Methos with ONE arguments :" + bb);
	}
	
	 public static void MethodWithArg2(int a ,int b)
	{
		int aa,bb;
		aa=a;
		bb=b;
		System.out.println("Static Methos with TWO arguments :" + aa + " " + bb);
	}
	   public void MethodWithArg2(int a ,int b, int c)
		{
			int aa,bb,cc;
			aa=a;
			bb=b;
			cc=c;
			System.out.println("Static Methos with Three arguments :" + aa + " " + bb + " " + cc);
		}

	public static void main(String[] args) {

		MethodWithArg2(10);
		MethodWithArg2(10,20);
		MethodsWithArguments M =new MethodsWithArguments();
		M.MethodWithArg2(10,20,30);
	}

}
