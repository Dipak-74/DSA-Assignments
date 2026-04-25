import java.util.*;
class Demo{
	public static void main(String[]args){
		String str="qwertyuiopasdfghjklzxcvbnm";		
		HashSet <Character>set=new HashSet();
		
		for(int i=0;i<str.length();i++){

			char ch=str.charAt(i);
			if(ch>='a' && ch<='z'){
				set.add(ch);	
				
			}
		}	
		
	
	
		if(set.size()==26){
	
			System.out.println("Pargram");
		}
		else{System.out.println("Not Pargram");
}
				
	
	
		

	}
}


/*

OutPut- Pargram

*/