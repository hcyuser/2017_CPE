import java.util.*;
public class UVA11417 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int g = 0;
		while(input.hasNext()){
			int n = input.nextInt();
			g = 0;
			for(int i = 1;i<n;i++)
				for(int j=i+1;j<=n;j++){
					g+= GCD(i,j);
				}
			if(g!=0){	
			System.out.println(g);
			}
		}
	}
	static int GCD(int a,int b){
		int temp = 0;
		while(a%b!=0){
			temp = a%b;
			a = b;
			b = temp;
		}
		
		return b;
	}
}
