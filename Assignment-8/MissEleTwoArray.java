import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,1,2,2,2,3,7,3,4,5,6,};
		
		int [] arr2={1,1,2,2,2,3,5};
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num: arr2){
			hm.put(num,hm.getOrDefault(num,0)+1);
			
		}
		
		for(int n:arr){
			if(hm.getOrDefault(n,0)>0){
				hm.put(n,hm.get(n)-1);
			}
	
			else{
				System.out.println(n);
			}
		}		
	}
}


/*

OutPut- 7

*/