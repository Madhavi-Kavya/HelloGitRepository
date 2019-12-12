package StaticPackage;

import FirstSamplePackage.AccessSpecifiers;

public class AccessSpecifier2 {

	public static void  main(String[] args) {
		
	
	System.out.println("Public : " + AccessSpecifiers.a);
	System.out.println("Private can be Used iN Same Class :" );
	System.out.println("Protected can be used in Inherited class :");
	System.out.println("Default only in the same Package :");
	}
}
