package com.swtt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
public class TreeListenerDemo {
    private static int shellwidth=1000;
    private static int shellHeight=700;
    private static void addWighetToShell(Display display,Shell shell)
    {
        Tree tree=new Tree(shell,SWT.MULTI|SWT.BORDER);
        tree.setSize(150, 150);
        tree.setLocation(5, 5);
        TreeItem child1=new TreeItem(tree, SWT.NONE);
        child1.setText("child1");
        TreeItem child2=new TreeItem(tree, SWT.NONE);
        child2.setText("child2");
        TreeItem child3=new TreeItem(tree, SWT.NONE);
        child3.setText("child3");
        TreeItem child4=new TreeItem(tree, SWT.NONE);
        child4.setText("child4");
        
        TreeItem child41=new TreeItem(child4, SWT.NONE);
        child41.setText("child41");
        TreeItem child42=new TreeItem(child4, SWT.NONE);
        child42.setText("child42");
        TreeItem child43=new TreeItem(child4, SWT.NONE);
        child43.setText("child43");
        tree.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                TreeItem[] selectedItem=tree.getSelection();
                System.out.println("selected items");
                for(int i=0;i<selectedItem.length;i++)
                {
                    System.out.println(selectedItem[i].getText()+",");
                }
                System.out.println();
            }
        });
        tree.addTreeListener(new TreeListener() {
            
            @Override
            public void treeExpanded(TreeEvent arg0) {
                System.out.println("Tree  expanded");
                
            }
            
            @Override
            public void treeCollapsed(TreeEvent arg0) {
                System.out.println("Tree collapsed");
                
            }
        });
    }
    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        addWighetToShell(display, shell);
        shell.open();
        
        while(!shell.isDisposed())
        	
        {
            if(!display.readAndDispatch())
            {
                display .sleep();
            }
                
            
        }
    }
}


