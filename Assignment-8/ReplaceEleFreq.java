import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr ={1,2,2,3};
		
		
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num: arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
			
		}
		
		int[] arr2=new int [arr.length];
		
		for(int i=0;i<arr.length;i++){
			int k=hm.get(arr[i]);
			arr2[i]=k;
		}
			
		System.out.println(Arrays.toString(arr2));		
	}
}


/*

OutPut- 2,2

*/