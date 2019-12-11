package com.lang;
import java.io.*;

public class _Runtime {
public static void main(String[] args) {
	System.out.println("***_runtime..**");
	try
	{
		Runtime.getRuntime().exec("calc.exe");
		Runtime.getRuntime().exec("notepad.exe");
		Runtime.getRuntime().exec("mspaint.exe");
		String line;
	}
}
}
