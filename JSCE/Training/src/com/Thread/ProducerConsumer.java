package com.Thread;

class ProducerConsumer {
	private String message;
	private boolean hasMessage;
	
	public synchronized void putMessage(String message)
	{
		while(hasMessage) {
			try {
				wait();
				
			}catch(InterruptedException e)
			{
				
			}
			
		}
		hasMessage=true;
		this.message=message +"put @"+ System.nanoTime();
		notify();
	}
}

	public synchronized  String getMessage()
	{
		while(!hasMessage) {
			try {
				wait();
				
			}catch(InterruptedException e)
			{
				
			}
			
		}
		hasMessage=false;
		this.message=message +"get @"+ System.nanoTime();
		notify();
	}
	
}
public class ProducerConsumer{

	public static void main(String args[])
	{
		final MessageBox box=new MessgaeBox();
		
		Thread producerThread =new Thread();
		{
			public void run()
			{
				System.out.println("producer thread started..");
				for(int i=1; i<=6;++i)
				
					box.putMessage("message"+i);
					System.out.println("put message"+i);
			}
		}
	};

	
	Thread consumerThread1 =new Thread()
			{
		public void run()
		{
			System.out.println("consumer thraed 1 started..");
			for(int i=1; i<=3;++i)
				
				
				System.out.println("consumer thrad 1 get"+ box.getMessage()+);
		}
		};
		






