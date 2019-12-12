package StaticPackage;

import FirstSamplePackage.VariablesClass;

public class StaticVariablesFromFirstPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesClass v =new VariablesClass();
		
		System.out.println("Static Variables from Different Package");
		System.out.println(v.a + " " + v.b);
		
	}

}
