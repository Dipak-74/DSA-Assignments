import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.print("Output:- ");
		double sum=0;
		int count=0;
		int dup=n;
		int copy=n;
		while(dup>0){
		count++;
		dup=dup/10;
		}
		while(n>0){
			int lastdigit=n%10;
			sum=sum+Math.pow(lastdigit,count);
			n=n/10;
			
		}
		if(copy==sum){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
	}
}


/*/
Output -

n = 153
Output:- Armstrong Number

/*/