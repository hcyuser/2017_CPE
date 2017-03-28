import java.util.*;
public class UVA10170TimeLimit {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		while(input.hasNext()){
			long start = input.nextLong();
			long date = input.nextLong();
		
			long i=0,show=0;
			while(i<date){
				for(int w=0;w<start;w++){
					show = start;
					
					i++;
					if(i==date){
						break;
					}
				}
				start = start +1;
			}
			System.out.println(show);
		}

	}



}
