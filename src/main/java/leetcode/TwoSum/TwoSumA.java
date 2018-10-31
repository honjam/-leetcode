package leetcode.TwoSum;

import java.util.Arrays;

public class TwoSumA {

	public static void main(String[] args) {
		int restlt[] = TwoSum(new int[] { 2, 7, 11, 15 }, 22);
		System.out.println(Arrays.toString(restlt));
	}

	public static int[] TwoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };

	}
}
