import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,1,2,2,2,3};
		int k=2;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num: arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
			
		}
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()>k){
				System.out.println(entry.getKey());
			}
		}
	}
}