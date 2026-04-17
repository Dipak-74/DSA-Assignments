class Demo{
	public static void main(String[]args){
		int [] arr={3,9,1,7};
		int max=arr[0];
		int sc=0;
		 max=f(arr,0,max,sc);
		System.out.println(max);
	}
	static int f(int [] arr,int index,int max,int sc){
		if(index==arr.length){
			return sc;
		}
		if(arr[index]>max){
			int temp=max;
			max=arr[index];
			sc=temp;
		}
	
		else if(arr[index]>sc && arr[index]<max){
			sc=arr[index];
		}
		
		return f(arr,index+1,max,sc);
	}
}

/*
output- 7
*/