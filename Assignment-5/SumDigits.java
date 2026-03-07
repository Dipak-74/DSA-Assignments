import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.print("Output:- ");
		int rev=0;
		int sum=0;
		while(n>0){
			int lastdigit=n%10;
			sum=sum+lastdigit;
			n=n/10;
			
		}
		
			System.out.println(sum);
		
	}
}


/*/
Output -

n = 543
Output:- 12

/*/