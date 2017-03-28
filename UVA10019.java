import java.util.*;
public class UVA10019{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		for(int i=0;i<s;i++){
			int test = input.nextInt();
			int b1=0,b2=0;
			int t1=test,t2=test;
			int t22=0;
			while(t1!=0){
				if((t1%2)!=0){
				b1++;
				}
				t1=t1/2;
			}
			int z=0;
			while(t2!=0){
				
				t22 = t22+(int)((t2%10)*Math.pow(16,z));
				t2=t2/10;
				z++;
			}
			while(t22!=0){
				if((t22%2)!=0){
				b2++;
				}
				t22=t22/2;
			}
		
		System.out.println(b1+" "+b2);
		
		
		}
	
	
	
	
	
	}






}