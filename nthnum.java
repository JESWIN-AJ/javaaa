import java.util.*;
class nthnum
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("the num find sum sum is  ");
	int num=sc.nextInt();
	int i=0;
	int sum=0;

	while(i<=num){
	 sum=sum+i;
	i++;

	
	}
	System.out.println("the sum is  "+sum);

  }
}
