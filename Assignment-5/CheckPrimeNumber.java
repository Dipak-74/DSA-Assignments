import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.print("Output:- ");
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not prime Number");
		}
	}
}


/*/
Output -

n = 7
Output:- Prime Number

n = 9
Output:- Not Prime Number


/*/