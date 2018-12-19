import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HassshSet {

	public static void main(String[] args) {
		// Hash Set doesn't accept duplicate values an dit accepts NULL values.
		//There is no guarantee that Hash set store values in a sequential order
		//HashSet,Tree set,LinkedHashSet uses set collection
		HashSet<Integer> hs = new HashSet<Integer>();
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(20);
		myList.add(30);
		myList.add(50);
		myList.add(40);
		myList.add(70);
		myList.add(90);
		myList.add(119);
		
		for(Integer nums:myList) {
			hs.add(nums);
		}
		hs.add(200);hs.add(400);
		//System.out.println(hs.size());
		for(Integer inHs:hs) {
			System.out.println(inHs);
		}
		System.out.println(hs.contains(90));
		System.out.println(hs.size());
		Iterator<Integer> its = hs.iterator();
		while(its.hasNext()) {
			int val = its.next();
			if(!myList.contains(val))
				System.out.println(val + "not in LIst");
		}
	}
}
	
		
		
		
	


