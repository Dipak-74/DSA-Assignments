class Demo{
	public static void main(String[]args){
		int [] arr={2,4,6};
		
		boolean even=f(arr,0);
		System.out.println(even);
	}
	static boolean f(int [] arr,int index){
		if(index==arr.length){
			return true;
		}
		if(arr[index]%2!=0){
			return false;
		}
		
		return f(arr,index+1);
	}
}

/*
output- true
*/