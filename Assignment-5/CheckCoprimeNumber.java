import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("a = ");
		int a=sc.nextInt();
		System.out.print("b = ");
		int b=sc.nextInt();

		System.out.print("Output:-  ");
		int gcd=1;
		for(int i=1;i<=Math.min(a,b);i++){
			if(a%i==0 && b%i==0){
			gcd=i;
				
			}
				
		}
		if(gcd==1){
		System.out.print("Coprime Number");
		}
		else{		
			System.out.print("Not Coprime Number");
		}
		
	}
}


/*/
Output -

a = 8
b = 15
Output:-  Coprime Number

/*/