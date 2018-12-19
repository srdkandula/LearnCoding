

public class thiss {
 int sum = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiss t=new thiss();
   System.out.println(t.sum);
  t.somthing();
  thiss.statsomthing();
	}
	//this is not a static class...so it need to instantiated
	public  void somthing() {
		int newsum = this.sum + 5;
		System.out.println(newsum);
	}
	//this is a static class, so we can call it directly without instantiating them
	
	public static void statsomthing() {
		thiss s=new thiss();
		int newsum = s.sum + 10;
		System.out.println(newsum);
	}

}
