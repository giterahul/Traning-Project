class A 
    {
        int i;
        void display() 
        {
            System.out.println(i);
        }
    }    
    class B extends A 
    {
        int j;
        void display() 
        {
            System.out.println(j);
        }
    }    
    class C 
    {
        public static void main(String args[])
        {
            B obj = new B();
            A obj1=new A();
            obj.i=1;
            obj.j=2;   
            obj.display(); 
            obj1.display();  
  
        }
   }