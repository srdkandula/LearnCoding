import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("enter new variale");
		int numToCheck = scan.nextInt();
   
   if (numToCheck == 1 || numToCheck == 2) {
	   System.out.println(numToCheck+"  is a prime number"); 
	   return;
   } else if(numToCheck % 2 == 0 || numToCheck < 0) {
	   System.out.println(numToCheck+"  is not an prime number");
	   return;
   } else {
	   for(int counter = 3; counter < numToCheck; counter++) {
		   if(numToCheck % counter == 0) {
			   System.out.println(numToCheck + "  is not a prime number");
			   return;
		    }
	   }
		   
	   		   
   }
   
   System.out.println(numToCheck + " Is Prime");
	   
	   
   }   }
 

