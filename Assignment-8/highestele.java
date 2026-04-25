import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,2,3,3,3,4,4};
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			hm.put(num,hm.getOrDefault(num,0)+1);
		}
		int maxfreq=0;
		for(int freq:hm.values()){
			if(freq>maxfreq){
				maxfreq=freq;
			}
		}	
		int secondmaxFreq=0;
		for(int freq : hm.values()){
   		 if(freq > secondmaxFreq && freq < maxfreq){
      			  secondmaxFreq = freq;
   		 }
		}
	
	
	
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
			if(entry.getValue()==secondmaxFreq){
				System.out.println(entry.getKey());
			}
		}
		
	}
}



class For{
	public static void main(String[]args){
		int [] arr={1,2,2,3,3,3,4,4};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int [] arr2=new int[max+1];
		for(int i=0;i<arr.length;i++){
			arr2[arr[i]]++;			
		}
		int maxfreq=0;
		int secondmaxfreq=0;
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]>maxfreq){
				maxfreq=arr2[i];		
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]>secondmaxfreq &&  arr2[i]<maxfreq){
				secondmaxfreq=arr2[i];
			}
		}
	
		
		for(int i=0;i<arr2.length;i++ ){
			if(arr2[i]==secondmaxfreq){
				System.out.println(i);
			}
		}
	}	
}






















