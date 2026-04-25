import java.util.*;
class Demo{
	public static void main(String[]args){
		String s1="heart";
		String s2="earth";		
		HashMap <Character,Integer>hm=new HashMap();
		
		for(char ch: s1.toCharArray()){
			
			if(hm.containsKey(ch)){
				
				hm.put(ch,hm.get(ch)+1);

					
			}
			else{
				hm.put(ch,1);
			}
	
			
		}	
		boolean found=false;
		
		
		for(char ch : s2.toCharArray()){
	
			if(hm.containsKey(ch) && hm.get(ch)>0){	
	
				hm.put(ch,hm.get(ch)-1);
				found=true;
				
			}
			else{

				found=false;
				break;
				
			}
					
		}
		if(found){
			System.out.println(found);
		}	
	
		else{
		 	System.out.println(found);

	
		}
		

	}
}


/*

OutPut- True

*/