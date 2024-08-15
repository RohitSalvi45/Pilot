import java.util.Scanner;  // *** Explanation of the code at the end
public class methodBasics {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int i = scanner.nextInt();
		
		System.out.println("Enter the Second Number");
		int j = scanner.nextInt();
		
		System.out.println("Addition of the number is "+demo1(i,j));
		
		methodBasics2 obj = new methodBasics2();
		String roh = obj.demo2();
		System.out.println(roh);  /*here we used method from another
		                            class file "methodBasics2 and called 
		                            the value from the method we created there"*/
	}
	
	public static int demo1(int i, int j)
	{

		int k = i+j;
		return k;     
	}
	
	/* Methods are created in the case where we need to execute and re-use something
      multiple times.
	 
	 * First we created a method - public static void demo1()
      here, if we dont use static keyword, we will have to create an object in the
      main class first. eg- methodBasics d = new methodBasics();
      and then use demo1         String word = d.demo1();
      
      * Also, When we use static keyword, the object is moved on a class level
         
      
      
      

*/

}
