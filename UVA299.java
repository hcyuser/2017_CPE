import java.util.*;
public class UVA299 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cas1 = input.nextInt();
		for(int i=0;i<cas1;i++){
			int counter=0;
			int cas2 = input.nextInt();
			int[] arr = new int[cas2];
			for(int w=0;w<cas2;w++){
				arr[w]= input.nextInt();
			}
			for(int x=0;x<(cas2-1);x++){
				for(int y=1;y<cas2;y++){
					if(arr[y-1]>arr[y]){
						int temp = arr[y-1];
						arr[y-1] = arr[y];
						arr[y] = temp;
						counter++;
					}
				}
			}
			System.out.println("Optimal train swapping takes "+counter+" swaps.");
		}
	}
}
