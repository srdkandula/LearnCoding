import java.util.ArrayList;

public class StackProcess {
	ArrayList<Integer> stacking = new ArrayList<Integer>();
	public static void main (String args[]) {
		StackProcess s = new StackProcess();
		s.push(3);
		s.push(5);
		s.push(4);
		s.push(1);
		try {
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void push(int numToPush) {
		stacking.add(numToPush);
	}
	public int pop() throws Exception{
		if (stacking.size() == 0) {
			throw new Exception("Empty Stack");
		}
		int indexToPop = (stacking.size() - 1);
		int popValue = stacking.get(indexToPop);
		stacking.remove(indexToPop);
		System.out.println(popValue);
		return popValue;
	}
}
