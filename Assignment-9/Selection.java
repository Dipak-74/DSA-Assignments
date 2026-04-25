import java.util.*;
class Demo{
	public static void main(String[]args){
		int[] arr={18,22,20,19,21};
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int minindex=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[minindex]){
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

/*
output-[18, 19, 20, 21, 22]
*/