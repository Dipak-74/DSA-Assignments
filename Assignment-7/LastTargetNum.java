class Demo{
	public static void main(String[]args){
		int [] arr={5,2,3,2,4};
		int num=2;
		int index=f(arr,num,arr.length-1);
		System.out.println(index);
	}
	static int f(int [] arr,int num,int index){
		if(index==-1){
			return -1;
		}
		if(arr[index]==num){
			return index;
		}
		
		return f(arr,num,index-1);
	}
}

/*
output- 3
*/