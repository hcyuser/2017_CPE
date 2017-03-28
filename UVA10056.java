
import java.util.*;

public class UVA10056 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {

			int N = sc.nextInt();

			double P = sc.nextDouble();

			int I = sc.nextInt();

			System.out.printf("%.4f", P == 0 ? P : P * Math.pow(1 - P, I - 1) / (1 - Math.pow(1 - P, N)));

			System.out.println();
		}

		sc.close();
	}

}


