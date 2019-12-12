package StaticPackage;

import FirstSamplePackage.MethodsWithArguments;

public class MethodsWithArgumentsDifferentPackage {
	
	public static void main(String[] args) {

		MethodsWithArguments.MethodWithArg2(10);
		MethodsWithArguments.MethodWithArg2(10, 20);

		MethodsWithArguments M = new MethodsWithArguments();
		M.MethodWithArg2(10,20,30);
		
		
	}

}
