package com.arraylist;

public class OccurenceNumbers {

	public static void main(String[] args) {
		 String str = "HelloHelloHelloWorld!";
		 String substring = "l";
		int count=0;
		int index=0;
		
		while (index !=-1) {
			index=str.indexOf(substring, index);
			if (index !=-1) {
				count++;
				index=index+substring.length();
			}
		}
		
		
		
		System.out.println("Total occurrences of \"" + substring + "\": " + count);
	}

}
