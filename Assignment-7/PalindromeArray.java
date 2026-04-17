class Demo{
	public static void main(String[]args){
		int [] arr={1,2,3,2,1};
		
		boolean palin=f(arr,0);
		System.out.println(palin);
	}
	static boolean f(int [] arr,int index){
		
		if(arr[index]!=arr[arr.length-1-index]){
			return false;
		}
		if(index==(arr.length-1)/2){
			return true;
		}
		
		
		return f(arr,index+1);
	}
}

/*
output- 1
*/