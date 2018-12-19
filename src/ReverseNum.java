
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=1234567809;
 int newno=0;
 long Rnum=0;
 //reversing a number
 while(n>=1) {
	newno=n%10;
	n=n/10;
	Rnum=(Rnum*10)+newno;
 }

 System.out.println(Rnum);
	}

}
