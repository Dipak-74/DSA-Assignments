import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,2,2,3};
		int k=2;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num: arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
			
		}
		int count=0;
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()==1){
				count++;
			}
		}
		int []arr2=new int[count];
		int i=0;
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()==1){
				arr2[i]=entry.getKey();	
				i++;	
			}
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}


/*

OutPut- [1, 3]

*/