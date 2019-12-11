package com.inheritance;
abstract class Document{
	String text;
	public Document()
	{
		text="Document..";
		System.out.println("Document->def.");
	}
	public Document(String text) {
		this.text = text;
		System.out.println("Document->param..");
	}
	public void print()
	{
		System.out.println("Document->printing:"+text);
	}
	public abstract void open();
	public abstract void save();
	public abstract void close();
	
}
class Word extends Document{
	public Word()
	{
		super("word..");
	}
	public Word(String ptext)
	{
		super(ptext);
	}
	@Override
	public void open() {
		System.out.println("word->opening");
		
	}
	@Override
	public void save() {
		System.out.println("word->saving");
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("word->closing");
	}
	
}
class Excel extends Document
{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Excel->opening");
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Excel->saving");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Excel->closing");
		
	}
	
}
class PowerPoint extends Document
{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("PowerPoint->opeing");
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("PowerPoint->saving");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("PowerPoint->closing");
		
	}
	
}
class LaserPrinting
{
	static int WordCount;
	static int ExcelCount;
	static int PowerPoinCount;
	static int DocumentCount;
	public void print(Document document)
	{
		DocumentCount++;
		if(document instanceof Word)
		{
			WordCount++;
		}
		if(document instanceof Excel)
		{
			ExcelCount++;
		
		}
		
	}
	
	
}


public class Test_Document {
	public static void main(String[] args) {
		Document doc=new Word();
		Document doc1=new Excel();
		Document doc2=new PowerPoint();
		doc.open();
		doc.save();
		doc1.open();
		doc2.open();
		
		LaserPrinting laser =new LaserPrinting();
		laser.print(doc);
		laser.print(doc1);
		System.out.println("no of word document"+laser.WordCount);
		System.out.println("no of excel document"+laser.ExcelCount);
		
	}
	
}
