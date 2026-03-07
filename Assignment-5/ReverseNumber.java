import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.println("Output- ");
		int rev=0;
		while(n>0){
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
			
		}
		System.out.println(rev);

	}
}


/*/
Output -

n = 12345
Output-
54321


/*/