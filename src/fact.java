//import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
        fact ft = new fact();
		System.out.println("the factorial is: "+ ft.factorial (4));
    }
	public int factorial(int n) {
		if(n <= 1)
		  return 1;
		int facts = n * factorial(n-1);
		return facts;
	}
}