import java.util.*;
public class UVA10050 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases  = input.nextInt();
		for(int i=0;i<cases;i++){
			int days = input.nextInt();
			int[] period = new int[days];
			for(int n=0;n<period.length;n++){
				period[n] = 0;
			}
			int parties = input.nextInt();
			int[] limit = new int[parties];
			for(int j=0;j<parties;j++){
				limit[j] = input.nextInt();
			}
			for(int m=0;m<limit.length;m++){
				for(int n= limit[m]-1;n<period.length;n=n+limit[m]){
					period[n] = 1;
				}
			}
			
			for(int k=5;k<days;k=k+7){
				period[k] = 0;
			}
			for(int l=6;l<days;l=l+7){
				period[l] = 0;
			}
			int count=0;
			for(int www=0;www<period.length;www++){
				if(period[www]==1){
					count++;
				}
			}
			System.out.println(count);
			
			
			
		}
		
		
	}
}
