import java.util.ArrayList;
import java.util.HashSet;


public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actualArr[] = { 8,9,10,11,8,9,10,11 };
		 ArrayList<Integer> al= new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int j : actualArr) {
			hs.add(j);
		}
		for (int x:hs) {
			al.add(x);
		}
		for(int arList:al) {
			System.out.println(arList);
		}
	}
}