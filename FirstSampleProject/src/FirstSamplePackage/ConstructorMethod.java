package FirstSamplePackage;

public class ConstructorMethod {

	ConstructorMethod()
	{
		System.out.println("Constructor has been Created.");
	}
	void Methods(int a, int b)
	{
		int aa, bb;
		aa=a;
		bb=b;
		System.out.println("Method  :" + aa*bb);
	}
	public static void main(String[] args) {
		
		ConstructorMethod C = new ConstructorMethod();
		C.Methods(10, 22);
		ConstructorMethod CC = new ConstructorMethod();

		
	}

}
