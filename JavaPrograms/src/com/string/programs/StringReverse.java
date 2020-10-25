package com.string.programs;

public class StringReverse {

	public static String reverseString(String str) {

		char[] charArray = str.toCharArray();
		int length = charArray.length;
		String temp = "";
		while (length > 0) {
			temp = temp + charArray[length - 1];
			length--;
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("abc"));
	}

}
