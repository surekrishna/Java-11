package com.krish.java.eleven.practice;

import java.util.stream.Collectors;

public class StringIsLinesMethod {

	public static void main(String[] args) {
		String str1 = "java11\nkrishna\nlearning";
		System.out.println(str1.lines().collect(Collectors.toList()));
	}
}
