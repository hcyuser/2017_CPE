import java.util.*;
class UVA11313{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int casess = input.nextInt();
		for(int i=0;i<casess;i++){
			int total = input.nextInt();
			int oneshow = input.nextInt();
			int count = 0;
			boolean isB = true;
			while(total>=2){
			total = total-oneshow;
			if(total<0){
				isB = false;
			}
			
			total = total+1;
			count++;
			}
			
			if(isB){
			 System.out.println(count);
			}else{
			
				System.out.println("cannot do this");
			}
		
		
		
		
		
		}
	
	
	
	
	
	
	}







}