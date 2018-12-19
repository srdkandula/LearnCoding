
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strToRev = "sarada";
		String strToDis = "";
		for(int counter = strToRev.length()-1; counter >= 0; counter--) {
			strToDis = strToDis +  strToRev.charAt(counter);
		}
		System.out.println(strToDis);
		if(strToRev == strToDis) {
			System.out.println(" given string is palindrome ");
		}else {
			System.out.println(" given string is not a palindrome ");
		}

	}

}
