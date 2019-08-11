package arrangement;

public class CountArrangementFunction {
	int count = 0;

	public int countArrangement(int N) {
		if (N == 0) {
			return 0;
		}

		int[] nums = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			nums[i] = i;
		}

		helper(nums, N);

		return count;
	}

	// Swapping method
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	// Helper method
	private void helper(int[] nums, int start) {
		// Whenever it gets to 0, then Increment count
		if (start == 0) {
			count++;
			return;
		}
		
		// start from the end
		for (int i = start; i > 0; i--) {
			swap(nums, start, i);

			if (nums[start] % start == 0 || start % nums[start] == 0) {
				// Recursion
				helper(nums, start - 1);
			}

			swap(nums, i, start);
		}
	}
}
