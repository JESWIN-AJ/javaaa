import java.util.*;
class  quadratic

{
  public static void main (String args[])
  {
    	Scanner sc=new Scanner(System.in);
	System.out.println("enter three values for a b c");
	int a=sc.nextInt();
	int c=sc.nextInt();

	int b=sc.nextInt();

	int s=0;
	int dis;
	dis=((b*b)-(4*a*c));
	double m1,m2,root;
	
	root=Math.sqrt(dis);

	if(dis<0){
		s= 2;
		
	}else if(dis>0){
		s=1;
		
	}

	

	switch(s)
{
	case 2:{
	System.out.println("it's a coplex num");
	m1=((-b-(root))/2*a);
	m2=((-b+(root))/2*a);
	System.out.println("m1  "+m1+"  m2 "+m2);
	break;

}
	
	
	
	
	case 1:{
	System.out.println("it's got two values");
	m1=((-b-(root))/2*a);
	m2=((-b+(root))/2*a);
	System.out.println(" m1 "+m1+" m2 "+m2);
	break;
	
}
	case 0:{	
	System.out.println("it's have two simila");
	m1=((-b-(root))/2*a);
	m2=((-b+(root))/2*a);
	System.out.println(" m1 "+m1+" m2 "+m2);
	break;

}
}
	
	

	
  }
}
