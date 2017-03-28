import java.util.Scanner;
public class UVA10190 {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		while(input.hasNext()){
			int upp = input.nextInt();
			int up  = upp;
			int down  = input.nextInt();
			int counter=0;
			boolean showup  = true;
			if(down==1){
				showup=false;
				
			}
			
			while(upp!=1&&(down!=1)){
				if(upp%down!=0){
					showup=false;
					break;
				}else{
					upp = upp/down;
					counter++;
				}
			}
			if(showup){
			counter++;
			int j=0;
			int[] myarr = new int[counter];
			myarr[0] = up;
			if(showup){
				System.out.print(myarr[0]+" ");
			}
			j++;
			while(up!=1&&(down!=1)){
				
					up = up/down;
					myarr[j] = up;
					if(j!=(counter-1)){
						System.out.print(myarr[j]+" ");
					}
					j++;
					
			}
			System.out.println(myarr[counter-1]);
			}
			if(showup){
				
			}else{
				showboring();
			}
		}
		
		
	}
	public static void showboring(){
		
		System.out.println("Boring!");
	}
}
