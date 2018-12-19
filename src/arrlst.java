import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

public class arrlst {

	public static void main(String[] args) {
	/* creating array list..array list is different from array
		1)Array list memory is dynamic and array memory is fixed.
		2)Adding an element from array and removing it or inserting in a the middle,displaying elements in the array is 
		  difficult task compared to array list collection,linked lists and vectors it accepts duplicate values also*/
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(2);
		//System.out.println(al);
		ArrayList<String> als=new ArrayList<String>();
		als.add("sarada");
		als.add("tanvi");
		als.add("sriknath");
		als.add("dad");
		als.add("mom");als.add("hanu");als.add("anu");
		als.add("saharsh");
		//System.out.println(al.indexOf(1));
		/*for(String str:als)
		{ System.out.print(str);}
		for(Integer num:al)
		{System.out.print(num);}
		//iterating
		   Iterator iter= als.iterator();
           while(iter.hasNext())
           {System.out.println(iter.next());}*/
        //sorting:same for integers and strings
           Collections.sort(als);
           for(String names:als)
           { System.out.println(names);}
		

	}

}
