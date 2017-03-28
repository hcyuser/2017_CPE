import java.util.*;
public class UVA10678{
	public static void main(String[] args){
		Scanner   input = new Scanner(System.in);
		int T = input.nextInt();
		while (T-- > 0) {
			int D = input.nextInt();
			int L = input.nextInt();
			
			double A = (double)L / 2.0;
			double B = 0.5 * Math.sqrt(L * L - D * D);
			System.out.printf("%.3f\n", Math.PI * A * B);
		}

	}
}