import java.util.*;
class Demo{
	public static void main(String[]args){

		int [] arr={18,22,20,19,21};
		int n=arr.length;
	
	
		for(int i=0;i<n;i++){
	
			int current=arr[i];
			int left=i-1;
			while(left>=0 && arr[left]>=current){	
				arr[left+1]=arr[left];
				left--;
			}
			arr[left+1]=current;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

/*

OUTPUT- [18, 19, 20, 21, 22]

*/