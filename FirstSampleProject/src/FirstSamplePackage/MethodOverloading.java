package FirstSamplePackage;

public class MethodOverloading {
	
	void OpenExcelSheet(String name)
	{
		String str;
		str=name;
		System.out.println("Sheet has been opened." + str);
	}
	void OpenExcelSheet(int number)
	{
		int num;
		num=number;
		System.out.println("Sheet has been opened : " + num);
	}
	public static void main(String[] args) {
		MethodOverloading M =new MethodOverloading();
		M.OpenExcelSheet("Sheet1");
		M.OpenExcelSheet(21);
		
	}

}
