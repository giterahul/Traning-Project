package com.Thread;

public class Test_Thread {
public static void main(String[] args) {
	Thread currThread=Thread.currentThread();
	System.out.println("name"+currThread.getName()+"\npriority:"+currThread.getPriority());
	currThread.setName("MyThread");
	currThread.setPriority(Thread.MAX_PRIORITY);
	System.out.println("Name:"+currThread.getName()+"\nPriority:"+currThread.getPriority());
	
	for(int index=0; index<20;index++)
	{
		System.out.println(index);
	}
	//new Thread(new RunThread()).start();
	//new ExtendThread().start();
	
	Thread runThread=new Thread(new RunThread());
	runThread.setName("RunnableThread");
	runThread.start();
	
	/*Thread extendsThread= new Thread(new ExtendsThread());
	extendsThread.setName("RunnableThread");
	extendsThread.start(); */
	
}
}
class RunThread implements Runnable{
	public void run()
	{
		for(int index=0; index<20;index++)
		{
			try
			{
				Thread.sleep(1000);
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("\t\t"+getName()+":->"+index);
		}
	}
	
}

class ExtendThread extends Thread{
	public void run()
	{
		for(int index=0; index<20;index++)
		{
			try
			{
				Thread.sleep(1000);
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("\t\t"+getName()+":->"+index);
		}
	}
	
}
