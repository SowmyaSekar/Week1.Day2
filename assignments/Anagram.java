package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	 * 
	 * Declare a String String text1 = "stops"; Declare another String String text2
	 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
	 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
	 * the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int count = 0;

		int length1 = text1.length();
		int length2 = text2.length();

		if (length1 == length2) {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);

			for (int i = 0; i < charArray2.length; i++) {

				if (charArray[i] == charArray2[i]) {
					count = count + 1;
				}

			}
			if (count == charArray.length) {
				System.out.println("Each letters matches");
			}
		}
	}

}
