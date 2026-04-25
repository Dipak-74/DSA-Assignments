import java.util.*;
class Demo{

	public static void main(String[]args){
		int [] arr= {2,6,3,5,11};
	
		HashMap<Integer,Integer>hm=new HashMap();
		for(int num:arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
		}
		
		int []ans=new int[2];
		int k=10;
		boolean found=false;
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			
			int n=k-entry.getKey();
			if(hm.containsKey(n) && n!=entry.getKey()){
				ans[0]=n;
				ans[1]=entry.getKey();
				found=true;
			}
		}
		if(found){System.out.println(Arrays.toString(ans));}
		else{System.out.println("Not Found");}
	}
}