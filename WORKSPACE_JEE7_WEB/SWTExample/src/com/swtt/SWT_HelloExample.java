package com.swtt;




import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class SWT_HelloExample {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub	
	Display display=new Display();
	Shell shell=new Shell(display);
	Shell but1=new Shell(display);
	Shell but2=new Shell(display);
	
	//Label label=new Label(shell,SWT.CENTER);
	//Button button=new Button(shell,SWT.PUSH);
	Button push= new Button(but1,SWT.PUSH);
	Button check=new Button(but2,SWT.CHECK);
	push.setText("rahul");
	push.setBounds(10, 20, 10, 10);
	
	
	
	
	//label.setText("Hello word");
	//label.setBounds(shell.getClientArea());
	
	
	shell.open();
	but1.open();
	but2.open();
	
	while(!but1.isDisposed())
	{
		if(!display.readAndDispatch()) {
			   display.sleep();
		
	}
	
	/*while(!shell.isDisposed()) {
		if(!display.readAndDispatch()) {
	   display.sleep();
		}
	} */
	display.dispose();
	
	}
	}
}

