package com.swtt;



import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonEx {
	public ButtonEx(Display display)
	{
		initUI(display);
	}
	public void initUI(Display display)
	{
		Shell shell=new Shell(display,SWT.SHELL_TRIM|SWT.CENTER);
		
		FormLayout layout=new FormLayout();
		shell.setLayout(layout);
		
		Button okBtn=new Button(shell,SWT.PUSH);
		okBtn.setText("OK");
		
		Button cancBtn=new Button(shell, SWT.PUSH);
		cancBtn.setText("cancel");
		
		FormData cancelData=new FormData(80, 80);
		cancelData.right=new FormAttachment(98);
		cancelData.bottom=new FormAttachment(95);
		cancBtn.setLayoutData(cancelData);
		
		FormData okData=new FormData(80,30);
		okData.right=new FormAttachment(cancBtn,-5,SWT.LEFT);
		okData.bottom=new FormAttachment(cancBtn,0,SWT.BOTTOM);
		okBtn.setLayoutData(okData);
		
		shell.setText("Buttons");
		shell.setSize(350, 200);
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}	
		
	}
	
	public static void main(String[] args) {
		Display display=new Display();
		ButtonEx abl=new ButtonEx(display);
		
	}

}
