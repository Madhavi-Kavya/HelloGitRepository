package FirstSamplePackage;

import java.util.Scanner;

public class DataFromConsole {
	
	int marks1 , marks2, marks3;
	
	DataFromConsole(int m1, int m2, int m3)
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	void total()
	{
		System.out.println("Total marks : " + (marks1+marks2+marks3));
	}
	void Average()
	{
		System.out.println("Average marks : " + ((marks1+marks2+marks3)/2) );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1, marks2, marks3;
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Enter Marks1 : ");
			Scanner S = new Scanner(System.in);
			marks1 = S.nextInt();
			System.out.println("Enter Marks2 : ");
			marks2 =S.nextInt();
			System.out.println("Enter Marks3 : ");
			marks3 = S.nextInt();
			
		DataFromConsole S1 = new DataFromConsole(marks1,marks2,marks3);
		S1.total();
		S1.Average();
		}
	}

}
