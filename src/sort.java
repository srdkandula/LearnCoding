import java.util.ArrayList;

public class sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] ary = { 9, 3, 6, 10, 8 };
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] > ary[j]) {
					int temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
			al.add(ary[i]);
		}
		System.out.println(al);
	}
}