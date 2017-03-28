import java.util.*;
public class UVA10041 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int totaltest = input.nextInt();
		
		for(int i=0;i<totaltest;i++){
			int total=input.nextInt();
			int[] house = new int[total];
			for(int w=0;w<total;w++){
				house[w]=input.nextInt();
			}
			Arrays.sort(house);
			int middle;
			if(total%2==0){
				middle=(house[total/2-1]+house[total/2])/2;
			}else{
				middle=house[total/2];
			}
			int distance=0;
			for(int ww=0;ww<total;ww++){
				if((middle-house[ww])<0){
					distance = distance-(middle-house[ww]);
				}else{
					distance = distance+middle-house[ww];
				}
				
			}
			System.out.println(distance);
		}
		
	}
}
