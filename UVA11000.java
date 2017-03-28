import java.util.*;
public class UVA11000 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int year  = input.nextInt();
			if(year==-1){
				break;
			}
			 long f = 1, m = 0;
			 for(int i = 0; i < year; i++){
		            long temp = m;
		            m = (f+temp);
		            f = temp+1;
		        }
			 System.out.println(m+" "+(m+f));
		}
	}
}