class Demo{
	public static void main(String[]args){
		int [] arr={1,5,3,7,2};
		int num=3;
		int count=0;
		count=f(arr,num,0,count);
		System.out.println(count);
	}
	static int f(int [] arr,int num,int index,int count){
		if(index==arr.length){
			return count;
		}
		if(arr[index]>num){
			count++;;
		}
		
		return f(arr,num,index+1,count);
	}
}

/*
output- 2
*/