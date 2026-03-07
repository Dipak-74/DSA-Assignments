import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		int count=0;
		while(n>0){
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}


/*/
Output -

n = 54321

output:- 5

/*/