package FirstSamplePackage;

public class AccessSpecifiers {
	
	public static int a= 10;
	private static int b=20;
	protected static int c=30;
	static int d=40;

	public static void main(String[] args) {
		System.out.println("Public  : " + a);
		System.out.println("Private : " + b);
		System.out.println("Protected : " + c);
		System.out.println("Default : " + d);
		
	}

}
