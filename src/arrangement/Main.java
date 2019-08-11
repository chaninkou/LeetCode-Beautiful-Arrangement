package arrangement;

public class Main {
	public static void main(String[] args) {
		int N = 2;
		
		System.out.println("Input: " + N);
		
		CountArrangementFunction solution = new CountArrangementFunction();
		
		System.out.println("Solution: " + solution.countArrangement(N));
	}
}
