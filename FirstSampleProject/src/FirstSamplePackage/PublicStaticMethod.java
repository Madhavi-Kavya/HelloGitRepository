package FirstSamplePackage;

public class PublicStaticMethod {
	
	public static void a1()
	{
		int a=100 , b=5 ;
		System.out.println("Method a1 :" + a*b);
	}
	
	public static void b1()
	{
		int a=200 , b=8;
		System.out.println("Method b1 : " + a*b);
	}
	
	public static void main(String[] args) {
		a1();
		b1();
	}

}
