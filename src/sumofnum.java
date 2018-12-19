
public class sumofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofnum sf=new sumofnum();
		int nums[]= {2,3,4,5,6,7,8};
		sf.twoSum(nums,10);
	}
    public void twoSum(int[] nums, int target) {
	     int len = nums.length;
	     int n=target;
	     //take every single element and add it to the next element ,if the sum 
	     //is target then return the indices ,break the loop and go to the next 
		for(int i=0;i<len;i++){
			for (int j=0;j<len;j++){
			     if(nums[i] + nums[j] == n){
			       System.out.println("the sum upto target are inthe indices :"+i+" "+j);
			       break;
			     } 
			 }
		 }
    }
}
	
		        
		       
