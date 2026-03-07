import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.println("Output- ");
		while(n>0){
			int lastdigit=n%10;
			System.out.println(lastdigit);
			n=n/10;
			
		}
		
	}
}


/*/
Output -

n = 5382
Output-
2
8
3
5
/*/