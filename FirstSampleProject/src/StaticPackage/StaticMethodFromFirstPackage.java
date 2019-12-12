package StaticPackage;

import FirstSamplePackage.PublicStaticMethod;

public class StaticMethodFromFirstPackage {

	public static void main(String[] args) {

		PublicStaticMethod M = new PublicStaticMethod();
		M.a1();
		M.b1();
	}

}
