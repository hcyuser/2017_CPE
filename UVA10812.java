import java.util.*;
public class UVA10812 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int testcase = input.nextInt();
		for(int i=0;i<testcase;i++){
			int suma = input.nextInt();
			int absnum = input.nextInt();
			if((absnum-suma)>=0){
				System.out.println("impossible");
			}else if((suma+absnum)%2==1){
				System.out.println("impossible");
			}else{
				int a,b;
				a = (suma+absnum)/2; 
				b = suma-a;
				System.out.println(a+" "+b);
			}
		}
		
	}
}
