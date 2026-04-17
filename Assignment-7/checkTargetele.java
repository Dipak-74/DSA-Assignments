class Demo{
	public static void main(String[]args){
		int [] arr={1,2,3,4};
		int target=3;
	 	boolean tar=f(arr,0,target);
		System.out.println(tar);
	}
	static boolean f(int [] arr,int index,int target){
		if(index==arr.length){
			return false;
		}
		if(arr[index]==target){
			return true;
		}
		
		return f(arr,index+1,target);
	}
}

/*
output- true
*/