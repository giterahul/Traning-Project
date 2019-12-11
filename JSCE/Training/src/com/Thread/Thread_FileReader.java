package com.Thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Thread_FileReader {
	public static void main(String[] args) {
		try(BufferedReader bufferReader=new BufferedReader(new FileReader("C:\\New folder\\abc.txt")));
				String line;
				while((line=bufferReader.readLine())!=null) {
					try {
						Thread.sleep(500);
						
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println(line);
					
				}catch(FileNotFoundException e)
		{
					e.printStackTrace();
		}
	}

}
