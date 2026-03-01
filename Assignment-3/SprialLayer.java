import java.util.*;
class SprialLayer{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		int m=2*n-1;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=m;j++){
				int top=i-1;
				int bottom=m-i;
				int left=j-1;
				int right=m-j;
				int value=n-Math.min(Math.min(top,bottom),Math.min(left,right));	
				System.out.print(value+" ");
			}
			System.out.println();
		}		
	}
}


/*/
Output -

n = 3

3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

/*/