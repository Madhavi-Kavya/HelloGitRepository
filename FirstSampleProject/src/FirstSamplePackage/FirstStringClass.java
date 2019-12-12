package FirstSamplePackage;

public class FirstStringClass {

	public static void main(String[] args) {
		String str = "SampleString" ;
		String str2 = "samplestring";
		
		System.out.println("Length of the variable :" + str.length());
		
		System.out.println("Starting Character is S :" + str.startsWith("S"));
	
		System.out.println("Ends with G :" + str.endsWith("g"));
		
		System.out.println("Lower case :" + str.toLowerCase());
		System.out.println("Upper Case : " + str.toUpperCase());
		
		boolean result;
		
		result = str.equalsIgnoreCase(str2);
		System.out.println("The result of EqualsIgnoreCase is : " + result);
		
		result = str.equals(str2);
		System.out.println("The result of Equals :" + result);
		
		System.out.println("The String Contains S " + str.contains("Sam1"));
		System.out.println("The String Contains X " + str.contains("X"));
		
		System.out.println("Joining the Strings : " + str + " " + str2);
		
		System.out.println("The Character At : " + str.charAt(5));
		
		String trim = "      Trimming of the string  ";
		System.out.println("    Trimming    of  the   string  " + trim.trim() );
		
		System.out.println("Replacing  : " + trim.replace(" ", ""));
		
		String a = "Trimming of the string abc asd qwe";
		String[] strArray = a.split(" ");
		for(int i=0 ; i< a.length() ; i++)
		{
			if(i==7)
			{ System.out.println("break :"); break; }
			System.out.println("The Sentence has been broken into subStrings :" + strArray[i]);
			
		}
		
		System.out.println("Advances For Loop");
		for(String w: a.split(" "))
		{
			System.out.println(w);
		
		}
		
		System.out.println("Split and Compare");
		for(String abc : a.split(" "))
		{
			if(abc.length() == 3)
				System.out.println(abc);
		}	
			}

}
