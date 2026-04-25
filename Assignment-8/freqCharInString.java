import java.util.*;
class Demo{
	public static void main(String[]args){
		String str="apple";		
		HashMap<Character,Integer>hm=new HashMap<>();
		for(char ch : str.toCharArray()){
			if(hm.containsKey(ch)){
				hm.put(ch,hm.get(ch)+1);
			}
			else{
				hm.put(ch,1);
			}
		}
	
		
		int max=0;
		for(Map.Entry<Character,Integer>entry:hm.entrySet()){
				if(entry.getValue()>=max){
					max=entry.getValue();
					
				}
		
		}
			
		for(Map.Entry<Character,Integer>entry:hm.entrySet()){
				if(entry.getValue()>=max){
					System.out.println(entry.getKey());
				}
		
		}		
	
	
		

	}
}


/*

OutPut- p

*/