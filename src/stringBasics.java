
public class stringBasics 
{
public static void main(String[] args)
 {
	//String is an "object" which represents sequence of characters
	//String can be defined in two ways. 1) String Literal 2) new memory allocator
	
	// String Literal
	String s = "hello";
	String s1 = "hello"; /* no new object is created the second time, as 
	                      both the object has same value*/

    // New Memory Allocator
	
	String s2 = new String("NewWord");
	String s3 = new String("NewWord"); //new object is created in this case
	
	String sentence = "Lambton College Toronto";
	String SplittedSentence[] = sentence.split(" ");
	System.out.println(SplittedSentence[0]);
	System.out.println(SplittedSentence[1]);
	System.out.println(SplittedSentence[2]);
	
	for(int i = 0; i<sentence.length(); i++)
	{
		System.out.println(sentence.charAt(i));
	}
	System.out.println("*******************");
	// For reverse print of characters of the sentence "Lambton College Toronto"
	
	for(int i = sentence.length()-1; i>=0; i--)
	{
		System.out.println(sentence.charAt(i));
	}
 }

}
