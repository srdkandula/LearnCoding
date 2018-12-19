import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class deleteAfterUse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		//is used to add more numbers at a time
		a.addAll(Arrays.asList("sarada","srikanth","sarada","Tanvi","Tanvi","Tanvi"));
		System.out.println(a);
		for(String name:a)
		{       
			if(hm.containsKey(name)) {
				int Value = hm.get(name);
				Value++;
				hm.put(name,Value);
			}else hm.put(name,1);
		}
		System.out.println(hm);
	}
}	
	

	
