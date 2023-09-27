import java.util.*;
class sumdigit
{
  public static void main (String args[])
  {
    	Scanner sc=new Scanner(System.in);

	int num=sc.nextInt();
	int sum=0;
	while(num!=0){
	int rem;
	rem=num%10;
	sum=sum+rem;
	num=num/10;
	
	
	}
	
	
	
	System.out.println("the num is "+sum);

  }
}
