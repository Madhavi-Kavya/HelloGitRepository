package FirstSamplePackage;

public class Method1 {
	
	int a=10;
	static int b=20;
	
	static void staticmethod1()
	{
		System.out.println("Static Variable :" + b);
		System.out.println("Non-Static Variable can not be used in Static Method :");
	}
	void nonstaticmethod()
	{
		System.out.println("Static Variable :" + b);
		System.out.println("NonStatic Variable :" + a);
	}

	public static void main(String[] args) {
		
		Method1 M = new Method1();
		staticmethod1();
		M.nonstaticmethod();		

	}

}
