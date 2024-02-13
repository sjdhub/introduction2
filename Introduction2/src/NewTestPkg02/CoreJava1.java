// variables, arrays, for loop, enhanced for loop. Chapter 22
package NewTestPkg02;

public class CoreJava1 {

	public static void main(String[] args) {
		
		int mynum = 5;
		String mytext = "My test only";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(mynum + " is number.");
		System.out.println(mynum + " and " + dec + " and " + letter);
		
		//Arrays
		int[] arr = new int[3];
		arr[0] = 2; arr[1] = 4; arr[2] = 6;
		
		int[] arr2 = {8,9,10,12,14};
		//System.out.println("Array 1 value of 3rd:  " + arr[2]);
		//System.out.println("Array 2 value of 1st: " + arr2[0]);
		
		String[] name = {"shehul", "desai", "java"};
		//for loop
		for (int i=0; i<name.length; i++)
		{
			//System.out.println("Value of place " + (i+1) + " is " + arr2[i]);
			System.out.println("Value of place " + (i+1) + " is " + name[i]);
			
		}
		//enhanced for loop
		for (String s: name)
		{
			System.out.println(s);
			
		}
		
		
	}
}
