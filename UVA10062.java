import java.util.*;
class UVA10062{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean isE =false;
		while(input.hasNext()){
			int[] chari = new int[97];
			int count = 0;
			if(isE){
				System.out.println();
				isE=false;
			}
			String str = input.nextLine();
			for(int i=0;i<str.length();i++){
				char c = str.charAt(i);
				chari[c-32]++;
				count++;
			}
			for(int w=1;w<=count;w++){
				for(int s=96;s>=0;s--){
					if(chari[s]==w){
						System.out.println((s+32)+" "+w);
						chari[s]=0;
					}
				}	
			}
			count=0;
			isE=true;
		
		
		
		
		}
	
	
	
	
	}




}