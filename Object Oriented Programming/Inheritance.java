// This program shows the use of inheritance.

class A
{
  void a_method()
  {
    System.out.println("I am in A class");
  }
}

class B extends A
{
  void b_method()
  {
    System.out.println("I am in B class");
  }
}

class Inheritance
{
  public static void main(String args[])
  {
    B b_obj = new B();
    
    b_obj.b_method();  // Accessing the method of B class.
    b_obj.a_method();  // Accessing the method of A class.
  }
}

/* Excepted output : 
                    I am in B class.
                    I am in A class.  */
