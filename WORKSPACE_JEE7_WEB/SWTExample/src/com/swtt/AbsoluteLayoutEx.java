package com.swtt;



import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AbsoluteLayoutEx {
	public AbsoluteLayoutEx(Display display)
	{
		initUI(display);
	}
	public static void main(String[] args) {
		Display display=new Display();
		AbsoluteLayoutEx abl=new AbsoluteLayoutEx(display);
	}
	
	
	
	private void initUI(Display display)
	{
		Shell shell=new Shell(display,SWT.SHELL_TRIM|SWT.CENTER);
		
		Button btn1=new Button(shell,SWT.PUSH);
		btn1.setText("Button");
		btn1.setBounds(10, 10, 10, 10);
		
		Button btn2=new Button(shell,SWT.PUSH);
		btn2.setText("Button");
		btn2.setSize(80, 30);
		btn2.setLocation(50, 100);
		
		shell.setText("Absolute layout");
		shell.setSize(300, 250);
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	}
}
