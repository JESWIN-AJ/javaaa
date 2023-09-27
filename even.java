import java.util.*;
class even
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("number is");
    int f=sc.nextInt();
    if(f%2==0)
    {
      System.out.println("f is even "+f);
    }
    else
    {
      System.out.println("f is odd "+f);
    }
  }
}
