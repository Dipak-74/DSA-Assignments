import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,2,2,3};
		
		int [] arr2={2,2,4};
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num: arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
			
		}
		
		for(int n:arr2){
			if(hm.getOrDefault(n,0)>0){
				hm.put(n,hm.get(n)-1);
				System.out.print(n+" ");
			}
	

		}		
	}
}


/*

OutPut- 2,2

*/