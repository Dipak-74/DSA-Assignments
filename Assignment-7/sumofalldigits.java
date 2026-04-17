class Demo{
	public static void main(String[]args){
		int [] arr={12,34,5};
		int digit=0;
		 digit=f(arr,0,digit);
		System.out.println(digit);
	}
	static int f(int [] arr,int index,int digit){
		if(index==arr.length){
			return digit;
		}
		int n=arr[index];
		while(n>0){
			int rem=n%10;
			digit=digit+rem;
			n=n/10;
		}		
		return f(arr,index+1,digit);
	}
}

/*
output- 15
*/