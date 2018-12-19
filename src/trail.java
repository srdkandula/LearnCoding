
public class trail {
	public static void main(String args[]) {
		int i1 = 5;
		int i2 = 6; 
		String str1 =  "sarada";
		String str2 = "sar";
		String str3 = "ada";
		String str4 = str2+str3;
		if(i1 == i2) {
			System.out.println("i worked");
		}else if (str1 == str4) {
			System.out.println("str1 == str4");
		}else if(str1.equals(str4)) {
			System.out.println("str1.equals str4");
		}
	}

}
