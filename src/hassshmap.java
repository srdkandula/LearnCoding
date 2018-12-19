
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hassshmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Map<String, ArrayList<Marks>> test = new HashMap<String, ArrayList<Marks>>();
		
		HashMap<Integer,String> hp=new HashMap<Integer,String>();
		
		//input into the hash map
		hp.put(1, "google chorme is my browser");
		hp.put(2, "safari is my browser");
		hp.put(1, "firefox is my browser");
		hp.put(4, "internet explorer is my browser");
		hp.put(5, "i dont want to stay home");
		
		
		//getting result from the hash map from..we get only string..
		System.out.println(hp.get(1));
		System.out.println(hp.get(3));
		System.out.println(hp.get(5));
		
		//to retrieve both key and value pair ...we need to convert this into a set
		Set<Entry<Integer, String>> setvalues = hp.entrySet();
		System.out.println(setvalues.toString());
		
		//to iterate the values of it
		Iterator<Entry<Integer, String>> i = setvalues.iterator();
		
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Map.Entry<Integer,String> mp=(Entry<Integer, String>)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}

}
