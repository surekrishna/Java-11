package com.krish.java.eleven.practice;

public class StringStripMethods {

	public static void main(String[] args) {
		String stripLeading = " krishna";
		String stripTrailing = "krishna ";
		String strip = " krishna ";
		
		System.out.println("Before strip Lengths");
		System.out.println("stripLeading Length = " + stripLeading.length());
		System.out.println("stripTrailing Length = " + stripTrailing.length());
		System.out.println("strip Length = " + strip.length());
		
		stripLeading = stripLeading.stripLeading();
		stripTrailing = stripTrailing.stripTrailing();
		strip = strip.strip();
		
		
		System.out.println(stripLeading.stripLeading());
		System.out.println(stripTrailing.stripTrailing());
		System.out.println(strip.strip());
		
		System.out.println("After strip Lengths");
		System.out.println("stripLeading Length = " + stripLeading.length());
		System.out.println("stripTrailing Length = " + stripTrailing.length());
		System.out.println("strip Length = " + strip.length());
	}
}
