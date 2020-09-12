// This program shows the use of inheritance.

class Human
{
  void eating()
  {
    System.out.println("I am eating.");
  }
}

class Student extends Human
{
  void reading()
  {
    System.out.println("I am reading.");
  }
}

public class Inheritance
{
  public static void main(String args[])
  {
    Student stud_obj = new Student();
    
    stud_obj.reading();  // Accessing the method of Student class.
    stud_obj.eating();  // Accessing the method of Human class.
    
  }
}

/* Expected output : 
                    I am in reading.
                    I am in eating.  */
