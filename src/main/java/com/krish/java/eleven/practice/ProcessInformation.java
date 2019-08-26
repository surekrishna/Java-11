package com.krish.java.eleven.practice;

public class ProcessInformation {

	public static void main(String[] args) {
		ProcessHandle handle = ProcessHandle.current();
		System.out.println(handle.pid());
		
		ProcessHandle.Info info = handle.info();
		System.out.println(info.arguments());
		System.out.println(info.commandLine());
		System.out.println(info.totalCpuDuration());
		System.out.println(info.startInstant());

	}

}
