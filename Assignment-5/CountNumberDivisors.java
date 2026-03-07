import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		int count=0;
		System.out.print("Divisors:- ");
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				System.out.print(i+" ");
				count++;
				if(i!=(n/i)){
					System.out.print(n/i+" ");
					count++;
				}
			}
		}
		System.out.println("Output:- "+count);

	}
}


/*/
Output -

n = 12
Divisors:- 1 12 2 6 3 4 
Output:- 6
/*/