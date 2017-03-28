import java.util.*;
public class UVA10190TimeLimit {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		while(input.hasNext()){
			int up  = input.nextInt();
			int down  = input.nextInt();
			boolean showup  = true;
			ArrayList<Integer> array = new ArrayList<>();
			if(down==1){
				showup=false;
			}
			while(up!=1&&(down!=1)){
				array.add(up);
				up = up/down;
				
			}
			array.add(up);
			for(int i=0;i<array.size()-1;i++){
				if(array.get(i)%down!=0){
					showup = false;
				}
			}
			if(showup){
				for(int j=0;j<array.size()-1;j++){
					System.out.print(array.get(j)+" ");
				}
				System.out.println(array.get(array.size()-1));
			}else{
				System.out.println("Boring!");
			}
			
		}
		
		
	}
}
