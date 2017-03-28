import java.util.*;
public class UVA10370 {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		int totaltest = input.nextInt();
		for(int i=0;i<totaltest;i++){
			int eachcase = input.nextInt();
			int[] array = new int[eachcase];
			double totalscore = 0;
			for(int w=0;w<array.length;w++){
				int temp = input.nextInt();
				totalscore = totalscore+temp;
				array[w] = temp;
			}
			totalscore = totalscore/eachcase;
			double counter = 0;
			for(int z=0;z<eachcase;z++){
				if(array[z]>totalscore){
					counter++;
				}
			}
			double percent = counter/eachcase*100;
			System.out.printf("%.3f",percent);
			System.out.println("%");
		}
	}
}
