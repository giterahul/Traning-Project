package com.swtt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class LoginForm {
	public static void main(String[] args) {
		
	Display display=new Display();
	final Shell shell=new Shell(display,SWT.SHELL_TRIM|SWT.CENTER);
	Label lbl=new Label(shell,SWT.NONE);
	lbl.setText("username");
	lbl.setBounds(10, 10, 80, 40);
	
	Label lbl1=new Label(shell,SWT.NONE);
	lbl1.setText("password");
	lbl1.setBounds(10, 70, 80, 40);
	
	Text textuser=new Text(shell, SWT.NONE);
	textuser.setText("");
	textuser.setBounds(100, 10, 80, 40);
	
	Text textpass=new Text(shell, SWT.NONE);
	textpass.setText("");
	textpass.setBounds(100,70, 80, 40);
	
	Button b1=new Button(shell,SWT.NONE);
	b1.setText("login");
	b1.setSize(50, 50);
	b1.setLocation(110, 110);

	
	Button b2=new Button(shell,SWT.NONE);
	b2.setText("cancle");
	b2.setSize(90, 70);
	b2.setLocation(120, 160);
	b2.addSelectionListener(new SelectionListener() {
		
		@Override
		public void widgetSelected(SelectionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("button click");
			
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("defult");
			
		}
	});
	Button b3=new Button(shell,SWT.NONE);
	b3.setText("clear");
	b3.setSize(150, 100);
	b3.setLocation(160, 170);
	
	
	shell.pack();
	shell.open();
	
	while(!shell.isDisposed()) {
		if(!display.readAndDispatch()) {
			display.sleep();
		}
	
	
	
}
}
}

