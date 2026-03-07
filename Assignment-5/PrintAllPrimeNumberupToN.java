import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.print("Output:-  ");

		for(int i=1;i<=n;i++){
			int count=0;
			for(int j=1;j<=n;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count<=2){
			System.out.print(i+" ");
			}

		
		}
	}
}


/*/
Output -

n = 20
Output:-  1 2 3 5 7 11 13 17 19

/*/