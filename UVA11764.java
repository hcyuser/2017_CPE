import java.util.*;
public class UVA11764 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int casess = input.nextInt();
		int showc = 1;
		for(int i=0;i<casess;i++){
			int incre = 0;
			int decre = 0;
			int nwall = input.nextInt();
			int[] walls = new int[nwall];
			for(int w=0;w<nwall;w++){
				walls[w] = input.nextInt();
			}
			for(int k=0;k<(nwall-1);k++){
				if((walls[k+1]-walls[k])>0){
					incre++;
				}else if((walls[k+1]-walls[k])<0){
					decre++;
				}
			}
			System.out.println("Case "+showc+": "+incre+" "+decre);
			showc++;
			
		}
		
		
		
		
	}
}
