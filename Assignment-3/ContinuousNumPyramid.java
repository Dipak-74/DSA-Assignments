import java.util.*;
class ContinuousNumPyramid{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++){
			for(int s=1;s<=n-i;s++){
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}	
		
		for(int i=n-1;i>=1;i--){
			for(int s=1;s<=n-i;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}


/*/
Output -

n = 4
   1
  2 3
 4 5 6
7 8 9 10
 11 12 13
  14 15
   16

/*/