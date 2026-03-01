import java.util.*;
class CrossNumberPattern{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j ||(i+j)==n+1){
					System.out.print(i+" ");
				}
				else{
					System.out.print("  ");

				}	
			}
			System.out.println();
		}



			
	}
}


/*/
Output -

n = 5

1       1
  2   2
    3
  4   4
5       5


/*/