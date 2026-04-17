class Demo{
	public static void main(String[]args){
		int [] arr={1,2,2,3,2};
		int num=2;
		int count=0;
		int index=f(arr,num,0,count);
		System.out.println(index);
	}
	static int f(int [] arr,int num,int index,int count){
		if(index==arr.length){
			return count;
		}
		if(arr[index]==num){
			count++;
		}
		
		return f(arr,num,index+1,count);
	}
}

/*
output- 3
*/