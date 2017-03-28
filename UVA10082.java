import java.util.*;
class UVA10082{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String test;
		String key = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while(input.hasNext()){
			test = input.nextLine();
			for(int i=0;i<test.length();i++){
				if(test.charAt(i)==' '){
					System.out.print(" ");
				}else{
					System.out.print(key.charAt(key.indexOf(test.charAt(i))-1));
				}
			
			}
			System.out.println();
		
		}
		 
	
	
	}


}