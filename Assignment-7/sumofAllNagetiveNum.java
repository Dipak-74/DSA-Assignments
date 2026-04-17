class Demo{
	public static void main(String[]args){
		int [] arr={1,-2,3,-4};
		int sum=0;
		 sum=f(arr,0,sum);
		System.out.println(sum);
	}
	static int f(int [] arr,int index,int sum){
		if(index==arr.length){
			return sum;
		}
		if(arr[index]<0){
			sum=sum+arr[index];
		}
		
		return f(arr,index+1,sum);
	}
}

/*
output- -6
*/