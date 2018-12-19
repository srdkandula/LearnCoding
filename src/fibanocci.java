
public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 
		fibanocci fb = new fibanocci();
		fb.fibSeries(21);
	}
	public void fibSeries(int numToLimit) {
		int sum;
		sum = 0;
		int firstNum = 0;
		int secondNum = 1;
		while(sum < numToLimit) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
		}
	}
}
