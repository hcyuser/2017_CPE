import java.util.*;
public class UVA10055 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			long a = input.nextLong();
			long b = input.nextLong();
			System.out.println(Math.abs(a-b));
		}
	}
}
