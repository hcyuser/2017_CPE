import java.util.*;
public class UVA10215 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			double length = input.nextDouble();
			double width = input.nextDouble();
			double a = 12;
			double b = -(4 * length + 4 * width);
			double c = length * width;
			double mincut = Math.min(width / 2, length / 2);
			double maxcut = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			System.out.printf("%.3f %.3f %.3f\r\n", maxcut, 0f, mincut);

		}

	}
}
