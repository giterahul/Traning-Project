class CommandLine1
{
public static void main(String args[])
{
 int x,y,z;
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);
z=x+y;
System.out.println("sum is"+z);
{
  z=x-y;
System.out.println("sub is"+z);
}
{
  z=x*y;
System.out.println("multi is"+z);
}
{
  z=x/y;
System.out.println("div is"+z);
}

}
}