class Demo{
	public static void main(String[]args){
		int [] arr={1,2,-3,4};
		
		boolean negative=f(arr,0);
		System.out.println(negative);
	}
	static boolean f(int [] arr,int index){
		if(index==arr.length){
			return false;
		}
		if(arr[index]<0){
			return true;
		}
		
		return f(arr,index+1);
	}
}

/*
output- true
*/