import java.util.*;
public class UVA10929 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String r1 = input.next();
			
			if(r1.equals("0")){
				break;
			}else{
				if(r1.length()>=9){
					System.out.println(r1+" is a multiple of 11.");
				}else{
				long cases = Long.parseLong(r1);
				if((cases%11)==0){
					System.out.println(cases+" is a multiple of 11.");
				}else{
					System.out.println(cases+" is not a multiple of 11.");
				}
				}
			}
		}
	}
}
