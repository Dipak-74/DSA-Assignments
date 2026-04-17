class Demo{
	public static void main(String[]args){
		int [] arr={3,9,1,7};
		int min=arr[0];
		 int mi=0;
		  mi=f(arr,0,min,mi);
		System.out.println(mi);
	}
	static int f(int [] arr,int index,int min,int mi){
		if(index==arr.length){
			return mi;
		}
		if(arr[index]<min){
			mi=index;
		}
		
		return f(arr,index+1,min,mi);
	}
}

/*
output- 2
*/