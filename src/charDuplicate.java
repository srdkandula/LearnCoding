import java.util.HashMap;
import java.util.Scanner;

public class charDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Print all duplicate characters from a string 
      HashMap<String,Integer> chrOccurance = new HashMap<String,Integer>();
      int count = 0;
      String cnrtToStr = null;
      @SuppressWarnings("resource")
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter a String");
	  String strToFindDuplicates = s.next();
	  char[] chrArray=strToFindDuplicates.toCharArray();
	  //adding into map 
	  for(char chr:chrArray) {
		  count =0;
		  if(chrOccurance.containsKey(chr)) {
			  count ++;
			  cnrtToStr = Character.toString(chr);
			  chrOccurance.put(cnrtToStr,count);
		  }else 	 
			  chrOccurance.put(cnrtToStr,1);
	   }
	   //
	   for(int idx=0; idx<strToFindDuplicates.length();idx++) {
		  if( (chrOccurance.get(strToFindDuplicates.charAt(idx)) >= 2)){
			  char[] noDuplicates = {};
			  noDuplicates[idx]=strToFindDuplicates.charAt(idx);
			  
		  }
		  
	  }
	  
		 
	  
	  
	  
	  
	  
   }
	   
  }



