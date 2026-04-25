import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,1,2,2,2,3};
		int k=2;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int num: arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
			
		}		
		int min=Integer.MAX_VALUE;
		
		int Secondmin=Integer.MAX_VALUE;
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()<min){
				int t=min;
				min=entry.getValue();
				Secondmin=t;
		
			}
			if(entry.getValue()<Secondmin && entry.getValue()>Secondmin){
	
			Secondmin=entry.getValue();
			}
		}
		
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()==Secondmin){
				System.out.println(entry.getKey());
			}
		}
		

	}
}


/*

OutPut- 1

*/