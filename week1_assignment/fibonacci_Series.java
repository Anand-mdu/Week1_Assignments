package week1_assignment;

public class fibonacci_Series {

	public static void main(String[] args) {
		
		int num=6;
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}
				
	}		
		
	}


