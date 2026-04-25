import java.util.*;
class Demo{
	public static void main(String[]args){

		int [] arr={30,25,27,35,29};
		int n=arr.length;
		
	
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
			
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

/*

OUTPUT-[25, 27, 29, 30, 35]

*/