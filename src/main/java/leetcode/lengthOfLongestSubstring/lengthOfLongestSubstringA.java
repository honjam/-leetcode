package leetcode.lengthOfLongestSubstring;

import java.util.HashSet;

/*
Given a string, find the length of the longest 
substring without repeating characters.
Example 1:
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, 
             "pwke" is a subsequence and not a substring.
Seen this question in a real interview before?
*/

public class lengthOfLongestSubstringA {

	public static void main(String[] args) {
		String test1 = "abcabcbb";
		String test2 = "bbbbb";
		String test3 = "pwwkew";
		String test4 = "aaa31aa2df";
		String test5 = "aab";
		int rest;
		lengthOfLongestSubstringA test = new lengthOfLongestSubstringA();
		System.out.println(test.lengthOfLongestSubstring(test1));
		System.out.println(test.lengthOfLongestSubstring(test2));
		System.out.println(test.lengthOfLongestSubstring(test3));
		System.out.println(test.lengthOfLongestSubstring(test4));
		System.out.println(test.lengthOfLongestSubstring(test5));
	}

	public int lengthOfLongestSubstring(String s) {
		int result = 0;
		if (s == null || s.length() == 0)
			return 0;

		HashSet<Character> Set = new HashSet<Character>();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (Set.contains(s.charAt(i))) {
				Set.remove(s.charAt(j++));
			} else
				Set.add(s.charAt(i++));
			result = Math.max(result, Set.size());
		}

		return result;

	}

}
