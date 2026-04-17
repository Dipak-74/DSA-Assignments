class Demo{
	public static void main(String[]args){
		int [] arr={3,9,1,7};
		int min=arr[0];
		 min=f(arr,0,min);
		System.out.println(min);
	}
	static int f(int [] arr,int index,int min){
		if(index==arr.length){
			return min;
		}
		if(arr[index]<min){
			min=arr[index];
		}
		
		return f(arr,index+1,min);
	}
}

/*
output- 1
*/