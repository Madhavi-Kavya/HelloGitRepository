package FirstSamplePackage;

public class NonStaticVariable2 {

	public static void main(String[] args) {

		NonStaticVariable N = new NonStaticVariable();
		System.out.println("Non Static Variable from a different class");
		System.out.println(N.x + " " + N.y);
	}

}
