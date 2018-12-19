
import java.util.ArrayList;

public class IndicesSum {
	public static void main(String args[]) {
		int numArray[] = {3,4,5,7,8,4,1};
		ArrayList<Integer> indicesList = new ArrayList<Integer>();
		for(int counter = 0; counter < numArray.length; counter++) {
		for(int innerCounter = counter + 1; innerCounter < numArray.length; innerCounter ++) {
			if( (numArray[counter] + numArray[innerCounter]) == 9) {
				indicesList.add(counter);
				indicesList.add(innerCounter);
			}
		}
		}
	    for(int numInList: indicesList) {
			System.out.println(numInList);
		}
		
	}

}
