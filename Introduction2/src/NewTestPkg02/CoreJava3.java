// String  Chapter 27
package NewTestPkg02;

public class CoreJava3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoreJava2 printstars = new CoreJava2();
		//declare string literal
		String S1 = "Welcome";
		String S2 = "Welcome";  // system won't create new object. it will refer to S1 only since values are same
		
		//declare by memory alocate operator
		String s3 = "Selenium course training";
		String s4 = "Selenium course training"; // unlike string literal..new object s4 will be created
		
		String[] newlist = s4.split("course");
		printstars.getdata();
		System.out.println(newlist[0]);
		System.out.println(newlist[1].trim());
		printstars.getdata();
//		for (int i=0; i<s4.length(); i++)
//		{
//			System.out.println(s4.charAt(i));
//		}
		//print s4 in reverse
		for (int k = s4.length()-1; k>=0; k--)
		{
			System.out.println(s4.charAt(k));
		}
		String originalStr = "Hello";
	    String reversedStr = "";
	    printstars.getdata();
	    System.out.println("Original string: " + originalStr);
	    printstars.getdata();
	    //print reverse    
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);
	    
	    printstars.getdata();
	}
	

}
