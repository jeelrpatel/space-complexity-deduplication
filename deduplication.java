
package labs;
import java.util.*;

//time complexity of 0(n^2) - bubble sort
// 0(1) space complexity - deduplication


public class Lab4 {
	
	public static void main(String[] args) {

		//initialize and assign the variables
		Scanner scan = new Scanner(System.in);
		Integer x = null;
		Integer amount = null; 
		Integer y = null;
		Integer z = null;
		Integer a = 1;
		boolean s = false;
		boolean l = false;
		Integer[] arr;
															
		while (s == false) {
			try {		
			//ask user for how many numbers to entered into array 
				System.out.println("Enter total number of elements in the array: ");
				x = scan.nextInt();
				if (x <= 0) {		
			//negative numbers are not allowed, user must enter number bigger than 0
					System.out.println();
					System.out.println("Not valid. Enter an integer bigger than 0.");
				} else
					s = true;
			} catch (Exception e) {
			//integer input
				System.out.println();
				System.out.println("Enter an integer.");
			}
			scan.nextLine();

		}
		//next line								
		y = x;									
		amount = x; 							
		arr = new Integer[x];							

		while (l == false) {							
			try {						
				//ask user to enter in the elements for the array
				System.out.println("Enter your elements: ");

				for (int i = 0; i < y; i++) {			
					x = scan.nextInt();
					arr[i] = x;
				}
				l = true;
			} catch (Exception e) {
				System.out.println();
				//only integers are allowed
				System.out.println("Not valid. Enter only an integer. " + amount);
			}
			scan.nextLine();

		}
		System.out.println();
		//list the initial  entries the user entered
		System.out.println("Initial entries: ");
		System.out.println("ARRAY[] = "+ Arrays.toString(arr)); 
		
		//for loops for depublication
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr.length - 1; j++) {		
				if (arr[j] > arr[j + 1]) {
					z = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = z;
				}
			}
		}

		  int n = 0;
	        for (int m = 0; m < y - 1; m++) {
	            if (arr[m + 1] == arr[m]) { 					
	                arr[m] = null; 					
	            }
	            
	        }
	        
		System.out.println();
		// display the entries after the deduplication
		System.out.println("Output after de-duplication: ");
		System.out.print("ARRAY[] = [");
		for (int i = 0; i < y; i++) {
															
			if (arr[i]==null) {                       
				                         					 
			} else {
				System.out.print(arr[i]);
				if(i < y-1) {
					System.out.print(",");
				}
				else 
					System.out.print("");
			}
			
			
		}
		System.out.println("]");
                                                         
	}
}
//nest for loop for bubble sort
