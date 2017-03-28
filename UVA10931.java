import java.util.*;
public class UVA10931 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int main = input.nextInt();
			if(main==0){
				break;
			}
			String pre = "";
			int count = 0;
			while(main!=0){
				int mods = main%2;
				main = main/2;
				pre = mods+""+pre;
			}
			for( int i=0;i<pre.length();i++){
				if(pre.charAt(i)=='1'){
					count++;
				}
			}
			System.out.println("The parity of "+pre+" is "+count+" (mod 2).");
			
		}
	}
}
