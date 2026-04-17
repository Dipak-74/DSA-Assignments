class Demo{
	public static void main(String[]args){
		int [] arr={9,7,5,2};
		
		boolean decrese=f(arr,0);
		System.out.println(decrese);
	}
	static boolean f(int [] arr,int index){
		if(index==arr.length-1){
			return true;
		}
		if(arr[index]<arr[index+1]){
			return false;
		}
		
		return f(arr,index+1);
	}
}

/*
output- false
*/