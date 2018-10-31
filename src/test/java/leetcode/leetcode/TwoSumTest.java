package leetcode.leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import leetcode.TwoSum.TwoSumA;

 

public class TwoSumTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
		TwoSumA test = new TwoSumA(); 
		int restlt[] = TwoSumA.TwoSum(new int[] { 2, 7, 11, 15 }, 22);
		System.out.println(Arrays.toString(restlt));
	}
	@Test
	public void test1() {
		// fail("Not yet implemented");
		TwoSumA test = new TwoSumA(); 
		int restlt[] = TwoSumA.TwoSum(new int[] { 7, 2, 11, 15 }, 9);
		System.out.println(Arrays.toString(restlt));
	}
}
