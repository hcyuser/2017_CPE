import java.util.*;
class UVA10035{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			int counter = 0,pre=0;
			if((a==0)&&(b==0)){
				break;
			}
			while((a!=0)||(b!=0)){
				
				if(((a%10)+(b%10)+pre)>=10){
					pre =1;
					counter++;
				}else{
					pre=0;
				}	
				a = a/10;
				b = b/10;
			}
			if(counter==0){
				System.out.println("No carry operation.");
			
			}else if(counter==1){
				System.out.println("1 carry operation.");	
			}else{
			
				System.out.println(counter+" carry operations.");
			}
			
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	}












}