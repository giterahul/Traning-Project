package com.swtt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ListenerExample {
	public static void main(String[] args) {
		
		Display display=new Display();
		final Shell shell=new Shell(display);
		shell.setLayout(new FillLayout());
		Composite parent=new Composite(shell,SWT.NONE);
		FillLayout fillayout=new FillLayout();
		fillayout.type=SWT.VERTICAL;
		parent.setLayout(fillayout);
		Label lbl=new Label(shell,SWT.NONE);
		
		Button btn1=new Button(parent,SWT.PUSH);
		btn1.setText("Button");
		
		shell.pack();
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		
		
	}

}
