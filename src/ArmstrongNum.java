import java.io.IOException;
import java.util.Scanner;
public class ArmstrongNum {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int numToCheck = 0;
		Scanner s = new Scanner(System.in);
		numToCheck = s.nextInt();
		System.out.println(numToCheck);
		int sumOfCubes = 0;
		int numToFindCubes = numToCheck;
		while(numToFindCubes >= 1) {
			int numberToFindCube = (numToFindCubes%10);
			numToFindCubes = numToFindCubes/10;
			int cubeOfNumber = (numberToFindCube)*(numberToFindCube)*(numberToFindCube);
			sumOfCubes = sumOfCubes + cubeOfNumber;
			}
		System.out.println(sumOfCubes);
		if(numToCheck == sumOfCubes) {
			System.out.println("Number is armstrong number");
			}else
			System.out.println("not a armstrong Number");
	}
}
