// This program shows how to create an array and calculate the sum of the array

import java.util.Scanner;
public class SumOfArray 
{
  public static void main(String args[])
  {
    int size, i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    size = sc.nextInt();
    int a[] = new int[size];
    System.out.println("Enter the " + size + " elements : ");
    
    for(i = 0;i < size;i++)
    {
      a[i] = sc.nextInt();
    }
    
    int sum = 0;
    
    for(i = 0;i < size;i++)
    {
      sum += a[i];
    }
    
    System.out.println("The sum of the array is : " + sum);
    
  }
}
