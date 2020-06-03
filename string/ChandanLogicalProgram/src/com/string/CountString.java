package com.string;

public class CountString {
	public static void main(String[] args) {

		String s = "sunil is from jabalpur in madhyaprdesh";
		String[] words = s.split("\\s");
		for (String word : words) {
			char[] ch = word.toCharArray();
			int length = ch.length;
			System.out.println(word + " come " + length + " times");
		}

	}

}
