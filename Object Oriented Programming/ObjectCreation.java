// This program shows how to create an object reference to a class in java.

class Another
{
  void hello()
  {
    System.out.println("Hello I am in new Class");
  }
}


class ObjectCreation
{
  public static void main(String args[])
  {
    Another object = new Another();  // Creating an object reference.
    object.hello();
  }
}

/* Expected Output : Hello I am in new Class */
