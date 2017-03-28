import java.util.*;
public class UVA10170 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			long start = input.nextLong();
			long date = input.nextLong();
			long sum=0,i=start;
			while(true){
				sum= sum+i;
				if(sum>=date){
					System.out.println(i);
					break;
				}
				i++;
			}
		}
	}
}
