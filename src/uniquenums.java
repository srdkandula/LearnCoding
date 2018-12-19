

import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;

public class uniquenums {

	public static void main(String[] args)
	{
          int[] intAr = {1,2,3,4,5,6,7,3,4,5,2,8,1,6};
          HashSet<Integer> set=new HashSet<Integer>();
          //adding values into set
          for (int i=0;i<intAr.length;i++) {
        	  	int j=intAr[i];
        	  	set.add(j);
        	  }
           int siz=set.size();
           //iterator should be declared only when the set has some values in it
           Iterator<Integer> itr=set.iterator();
          	int j = 0;
          	//since in java array size should be declared,or else it will be declared as null array and we cannot enter any values in the array
          	int[] Unique= new int[siz];
          //sending values from set to array
      		while(itr.hasNext()){ 
      			Unique[j]=itr.next();
      			j++;
      		}
          System.out.println(set);
          
            for(int x=0;x<Unique.length;x++){ 
            		System.out.println(Unique[x]);
            }
}
}
