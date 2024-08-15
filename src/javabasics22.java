import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javabasics22 {

	public static void main(String[] args) {
		
			int[] arr2 = {2,4,1,86,99,74,9,55,54};
			
			
		// FOR LOOP TO PRINT ONLY THE VALUES IN THE ARRAY WHICH ARE DIVISIBLE BY 2	
	        for(int i = 0 ; i<arr2.length ; i++)
	        {
	        	if(arr2[i]%2==0)
	        	{
	        		System.out.println(arr2[i]);
	        	}
	        	else
	        	{
	        		System.out.println(arr2[i]+" is Not dvisible by 2");
	        	}
	        }
	        
	    // ARRAYLIST - IT IS USED WHERE THE SIZE OF THE ARRAY NEED TO BE DYNAMIC
	        
	        ArrayList<String> place = new ArrayList<String>();
	        place.add("Toronto");
	        place.add("Mumbai");
	        place.add("Ontario");
	        
	        System.out.println("Place is "+place.get(1));
	        
	        for(int i = 0; i<place.size(); i++)
	        {
	        	System.out.println(place.get(i));
	        }
	        System.out.println("*******");
	        
	        for(String newplace : place)
	        {
	        	System.out.println(newplace);
	        }
	        
	        //Check if "place" contains a particular name
	        
	        System.out.println(place.contains("Ontario"));
	        
	        //Convert a normal array into arraylist
	        
	        String[] arr3 = {"ff","gg"};
	        
	        List<String> newArrayList = Arrays.asList(arr3);
	        System.out.println(newArrayList.contains("99"));
		}
}
