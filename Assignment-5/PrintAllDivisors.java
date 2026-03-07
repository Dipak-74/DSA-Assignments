import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.print("Output:- ");
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				System.out.print(i+" ");
				if(i!=(n/i)){
					System.out.print(n/i+" ");
				}
			}
		}
	}
}


/*/
Output -

n = 12
Output:- 1 12 2 6 3 4

/*/