package FirstSamplePackage;

public class ConstructorOverLoading {
	
	int marks1 , marks2 , marks3;

	ConstructorOverLoading()
	{
		System.out.println("Constructor has been created.");
	}
	ConstructorOverLoading(int m1, int m2)
	{
		marks1=m1;
		marks2=m2;
		System.out.println("Marks1 : " + marks1);
		System.out.println("Marks2 : " + marks2);
	}
	void total2()	
	{
		System.out.println("Total Marks : " + marks1+marks2);
	}
	void total3()
	{
		System.out.println("Total Marks : " + marks1+marks2+marks3);
	}
	void Average2()
	{
		System.out.println(("Average for 2 :" + (marks1+marks2)/2));
	}
	void Average3()
	{
		System.out.println(("Average for 2 :" + (marks1+marks2+marks3)/2));
	}
	ConstructorOverLoading(int m1, int m2,  int m3)
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
		System.out.println("Marks1 : " + marks1);
		System.out.println("Marks2 : " + marks2);
		System.out.println("Marks3 : " + marks3);
	}
	
	public static void main(String[] args) {

		ConstructorOverLoading S1 = new ConstructorOverLoading(73,49);
		S1.total2();
		S1.Average2();
		
		ConstructorOverLoading S2 = new ConstructorOverLoading();
		
		ConstructorOverLoading S3 = new ConstructorOverLoading(34,56,78);
		S3.total3();
		S3.Average3();
	}
}
