class Demo{
	public static void main(String[]args){
		int [] arr={3,1,1,7};
		
		 boolean unique=f(arr,0);
		System.out.println(unique);
	}
	static boolean f(int [] arr,int index){
		
			for(int i=index+1;i<=arr.length-1;i++){
				if(arr[index]==arr[i]){
					return false;
				}
			}
		 if (index == arr.length-1 ) {
           		 return true;
       		 }
		
		return f(arr,index+1);
		}
		
	
}