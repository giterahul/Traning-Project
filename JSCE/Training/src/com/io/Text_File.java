package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Text_File {
	public static void main(String[] args) {
		
		
		FileInputStream fileInput=null;
		int value=0;
		try
		{
			fileInput=new FileInputStream("C:\\New folder\\abc.txt");
			while((value=fileInput.read()) !=-1)
			{
				System.out.println((char) value);
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println("file not found"+e);
			e.printStackTrace();
		}catch(IOException e)
		{
			System.out.println("file not read"+e);
			e.printStackTrace();
		}
		
		finally
		{
			try {
				if(fileInput !=null)
					fileInput.close();
			}catch(IOException e)
			{
				System.out.println("unble to close"+e);
				e.printStackTrace();
			}
			
		}
	}
	public static void fileOutStream(String[] args)
	{
		String message="I want to be written to a file..";
				File file= new File("C:\\New folder");
				try
				(
					FileOutputStream fileOutput= new FileOutputStream(file);
					
					
				){
					fileOutput.write(message.getBytes());
					System.out.println("message is written to file..");
				}catch(FileNotFoundException e)
				{
					System.out.println("unable to open"+e);
				}catch(IOException e)
				{
					System.out.println("unable to write"+e);
				}
	}
	public static void fileInputOutStream()
	{
		File srcFile=new File("C:\\New folder\\rahul.txt");
		File destFile=new File("C:\\New folder\\gite.txt");
		int value=0;
		try(
				FileInputStream fileInput=new FileInputStream(srcFile);
				FileOutputStream fileOutput=new FileOutputStream(destFile);
			
				)
		{
			byte[] bytes=new byte[100];
			while((fileInput.read()) !=-1)
			{
				fileOutput.write(bytes);
				System.out.println("***");
				Arrays.fill(bytes,(byte)0);
			}
			System.out.println(srcFile.length()+"byte is written"+destFile.length());
		}catch(FileNotFoundException e)
		{
			System.out.println("unable to open"+e);
		}catch(IOException e)
		{
			System.out.println("unable to write"+e);
		}
				
	}
}
