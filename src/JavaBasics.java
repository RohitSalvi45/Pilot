
public class JavaBasics 
{
public static void main(String args[])
{
	//BASIC--------------------------------------------
	int number = 3;
	String word = "Rohit";
	double number2 = 3.99;
	boolean TorF = true;
	
	System.out.println("number is "+number+". String is "+word+
			". And the other two are "+number2+", and "+TorF+".");	
	//----------------------------------------------
	
	//ARRAYS--------------------------------------------
	
	int[] arr = new int[3];
	arr[0] = 2;
	arr[1] = 4;
	arr[2] = 1;
	
//Another way to initialize
	
	int[] arr2 = {2,4,1};
	
	System.out.println(arr2[2]);
	
	//FOR LOOP--------------------------------------------
	
	for(int i = 0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	
	String[] name = {"rohit","rahul","rohan"};
	
	for(int i = 0; i<name.length; i++)
	{
		System.out.println(name[i]);
	}
	
	//ENHANCED FOR LOOP
	
	for (String a : name) //will function similar to the previous for loop. 
		                  //basically means that display every string in the array and store it in variable "a"
    {
		System.out.println(a);
	}
	
	//---------------------------------------------------------
	
	
}
}
