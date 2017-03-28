import java.util.*;
public class UVA11332 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int casess = input.nextInt();
			if(casess!=0){
			int late = function1(casess);
			System.out.println(late);
			}
		}
	}
	public static int function1(int www){
		if((www/10)==0){
			return www;
		}else{
			int temp=0;
			while(www!=0){
				temp = temp+www%10;
				www = www/10;
			}
			return function1(temp);
		}
		}
}
