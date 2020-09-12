// This program shows how the abstraction works in java.

abstract class A
{
  abstract int add(int first, int second); // add method is of abstract type.
  
  int sub(int first, int second)
  {
    return first - second;
  }
}


class B extends A
{
  int add(int first, int second) // Defining the add class in the sub class.
  {
    return first + second;
  }
}


public class Abstraction
{
  public static void main(String args[])
  {
    B b = new B();
    
    System.out.println("Addition : " + b.add(10,20));
    System.out.println("Substraction : " + b.sub(10,20));
  
  }
}

/* Expected output : 
                      Addition : 30
                      Substraction : -10     */
