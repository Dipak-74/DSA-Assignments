class Demo{
	public static void main(String[]args){
		int [] arr={1,2,3,4};
		
		boolean sort=f(arr,0);
		System.out.println(sort);
	}
	static boolean f(int [] arr,int index){
		if(index==arr.length-1){
			return true;
		}
		if(arr[index]>arr[index+1]){
			return false;
		}
		
		return f(arr,index+1);
	}
}

/*
output- true
*/