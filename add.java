import java.util.*;
class add
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("number is");
    int a=sc.nextInt();
    int i=0,r,sum=0;
    while(a!=0)
     {
      r=a%10;
      sum=sum+r;
      a=a/10; 
     }
    System.out.println("sum is "+sum);
    System.out.println("*************************************");
  }
}
