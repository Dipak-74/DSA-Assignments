class Demo{
	public static void main(String[]args){
		int [] arr={3,9,1,7};
		int max=arr[0];
		 max=f(arr,0,max);
		System.out.println(max);
	}
	static int f(int [] arr,int index,int max){
		if(index==arr.length){
			return max;
		}
		if(arr[index]>max){
			max=arr[index];
		}
		
		return f(arr,index+1,max);
	}
}

/*
output- 9
*/