class Demo{
	public static void main(String[]args){
		int [] arr={10,20,30,40,50};
		int sum=0;
		 sum=f(arr,0,sum);
		System.out.println(sum);
	}
	static int f(int [] arr,int index,int sum){
		if(index==arr.length){
			return sum;
		}
		if(index%2!=0){
			sum=sum+arr[index];
		}
		
		return f(arr,index+1,sum);
	}
}

/*
output- 60
*/