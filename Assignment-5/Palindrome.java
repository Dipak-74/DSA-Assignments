import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.println("Output:- ");
		int rev=0;
		int dup=n;
		while(n>0){
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
			
		}
		if(dup==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}


/*/
Output -

n = 121
Output-
Palindrome

n = 123
Output-
Not Palindrome


/*/