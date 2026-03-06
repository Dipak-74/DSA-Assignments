import java.util.*;
class PascalTriangle{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			int num=1;
			for(int j=0;j<=i;j++){
				
				System.out.print(num);
				num=num*(i-j)/(j+1);
				
			}
			System.out.println();
		}	
	}
	
}


/*/
Output -

n = 5

1
11
121
1331
14641

/*/