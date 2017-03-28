import java.util.*;
class UVA10038{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	while(input.hasNext()){
		int c = input.nextInt();
		if(c==1){
			int temp = input.nextInt();
			System.out.println("Jolly");
		}else{
		int[] counter = new int[(c-1)];
		int[] se = new int[c];
		boolean isJ = true;
		for(int i=0;i<(c-1);i++){
			counter[i]=0;
		}
		for(int x=0;x<c;x++){
			se[x]=input.nextInt();
		}
		for(int w=0;w<(se.length-1);w++){
			int abss = Math.abs(se[w]-se[w+1]);
			if((abss>=c)||(abss<1)){
				isJ = false;
				break;
			}else{
				counter[(abss-1)]++;
			}
			
		}
		for(int y=0;y<(c-1);y++){
			if(counter[y]!=1){
				isJ = false;
			}
		}
		if(isJ){
			System.out.println("Jolly");
		}else{
			System.out.println("Not jolly");
		}
	
		}
	}
	
	
	
	
	
	}





}