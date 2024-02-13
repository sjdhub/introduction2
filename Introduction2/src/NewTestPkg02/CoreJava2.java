//conditional statement if and else inside loop, for-each loop, Arraylist ch 23
package NewTestPkg02;

import java.util.ArrayList;
public class CoreJava2 {
	
	public void getdata()
	{
		System.out.println("**************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoreJava2 printastrics = new CoreJava2();
		int[] arr1 = {1,2,3,4,5,6};
		//write code where numbers are even
		for (int i=0; i<arr1.length; i++)
		{
			if (arr1[i] % 2 == 0)
			{
				System.out.println("Even Number is: " + arr1[i]);
				
				//break;
			}
			else
			{
				System.out.println("Odd number is: " + arr1[i]);
			}
			
		}
		//System.out.println("**************************");
		printastrics.getdata(); // instead of printing astrics and write same line, using method here
		
		ArrayList<String> alist = new ArrayList<String>();
		//Create object of the class - object.method. alist is object here.
		alist.add("shehul");
		alist.add("desai");
		alist.add("selenium");
		for (String i : alist)    // for-each loop
		{
			System.out.println(i);
		}
		//System.out.println("**************************");
		printastrics.getdata(); // instead of printing astrics and write same line, using method here
		for (int k=0; k<alist.size(); k++)
		{
			System.out.println(alist.get(k));
			
		}
		//System.out.println("**************************");
		printastrics.getdata(); // instead of printing astrics and write same line, using method here
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for (String i : cars) {
	      System.out.println(i);
	    }
	    //System.out.println("**************************");
	    printastrics.getdata(); // instead of printing astrics and write same line, using method here
	   
	}
	
}
