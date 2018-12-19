import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		//sort single string
		
	 String strToSort = "sarada";
	 //sorted to character array
		 char[] strSorted = strToSort.toCharArray();
		  Arrays.sort(strSorted);
		 for(char letter : strSorted) {
			 System.out.print(letter);
		 }
		 
	}
}
                                      