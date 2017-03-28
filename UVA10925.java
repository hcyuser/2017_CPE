import java.util.*;
public class UVA10925 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = 1;
		while(input.hasNext()){
			long totalcase = input.nextLong();
			if(totalcase==0){
				break;
			}else{
				long friends = input.nextLong();
				long totalmoney = 0;
				for(int i=0;i<totalcase;i++){
					totalmoney = totalmoney + input.nextLong();
				}
				System.out.println("Bill #"+cases+" costs "+totalmoney+": each friend should pay "+(long)(totalmoney/friends));
				cases++;
				System.out.println();
			}
		}
	}
}
