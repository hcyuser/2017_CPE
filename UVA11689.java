import java.util.*;
public class UVA11689 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int casess = input.nextInt();
		for(int i=0;i<casess;i++){
			int o = input.nextInt();
			int str = input.nextInt();
			int cost = input.nextInt();
			int count =0;
			int totalb  = o+str;
			while(totalb>0){
				totalb = totalb-cost;
				count++;
				totalb++;
			}
			count--;
			System.out.println(count);
		}
		
		
		
		
		
	}
}
