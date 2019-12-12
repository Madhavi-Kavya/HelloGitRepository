package StaticPackage;

import FirstSamplePackage.NonStaticVariable;

public class NonStaticVariableFromFirstPackage {
	

	public static void main(String[] args) {
		NonStaticVariable N = new NonStaticVariable();
		
		System.out.println("NoN Static Variable From Different Package.");
		System.out.println(N.x + " " +N.y);
	}

}
