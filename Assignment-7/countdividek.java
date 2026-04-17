class Demo{
	public static void main(String[]args){
		int [] arr={2,4,5,6,9};
		int k=2;
		
		int count=0;
	
		count=f(arr,0,count,k);
		System.out.println(count);
	}
	static int f(int [] arr,int index,int count,int k){
		if(index==arr.length){
			return count;
		}
		if(arr[index]%k==0){
			count++;
		}
		
		return f(arr,index+1,count,k);
	}
}

/*
output- 3
*/