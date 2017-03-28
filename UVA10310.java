import java.util.*;
public class UVA10310 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int count  = input.nextInt();
			double GX = input.nextDouble();
			double GY = input.nextDouble();
			double DX = input.nextDouble();
			double DY = input.nextDouble();
			boolean issafe = false;
			for(int i=0;i<count;i++){
				double x = input.nextDouble();
				double y = input.nextDouble();
				double dogd = Math.pow((DX-x),2)+Math.pow((DY-y),2);
				double gd = Math.pow((GX-x), 2)+Math.pow((GY-y),2);
				if(2*gd<=dogd){
					System.out.printf("The gopher can escape through the hole at (%.3f,%.3f).\n", x, y);
					issafe = true;
				}
			}
			if(!issafe){
				System.out.println("The gopher cannot escape.");
				}
		}
	}
}
