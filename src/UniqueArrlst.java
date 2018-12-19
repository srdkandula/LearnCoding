import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueArrlst {

	public static void main(String[] args) {
		
		int[] Ary= {2,3,4,5,4,4,5,6,7,7,2,3};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		//enter the unique value into the key and run through for the array and increment the ocunter
		//if there are any other similar values ..finally check all values...if any value contains 0
		//then it is the unique.
		 for (int i=0;i<Ary.length;i++){
			 int counter=0;
			 for(int j=0;j<Ary.length;j++){
				 if (Ary[i]==Ary[j]) {
					 counter++;
					 }
			 }
			hm.put(Ary[i], counter) ;
		 }
	//System.out.println(hm);
	
	Set<Entry<Integer, Integer>> setvalues = hm.entrySet();
	Iterator<Entry<Integer, Integer>> i = setvalues.iterator();
	
	while(i.hasNext())
	{
	    Map.Entry<Integer,Integer> mp=(Entry<Integer, Integer>)i.next();
		if(mp.getValue().equals(1)==true){
				System.out.println("Unique number is :"+mp.getKey());}
		
		
	}
	
	
	}

}
