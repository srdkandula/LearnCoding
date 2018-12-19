
public class Marks {
	String subujest = "maths";
	Integer grade = 100;
	public static void main(String args[]) {
		Marks ma = new Marks();
		ma.Marks1("english", 50);
	}
	
	public void Marks1(String subujest, Integer grade) {
		// TODO Auto-generated constructor stub
		System.out.println(this.subujest);
		System.out.println(this.grade);
		this.subujest = subujest;
		this.grade = grade;
		System.out.println(this.subujest);
		System.out.println(this.grade);
	}

}
 