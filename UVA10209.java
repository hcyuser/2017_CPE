import java.util.*;
public class UVA10209 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		while(input.hasNext()){
			double total = input.nextDouble();
			double x = (1+Math.PI/3- Math.sqrt(3))*Math.pow(total, 2);
			double y = (Math.PI/12+Math.sqrt(3)/2-1)*Math.pow(total, 2);
			double z = (-Math.PI/6+1-Math.sqrt(3)/4)*Math.pow(total, 2);
			System.out.printf("%.3f"+" "+"%.3f"+" "+"%.3f"+"\r\n",x,4*y,4*z);
		}
	}
}
