import java.util.*;

public class UVA10101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0;

		while (sc.hasNext()) {

			count++;

			long number = sc.nextLong();

			System.out.printf("%4d.", count);

			if (number == 0)
				System.out.print(" 0");

			else
				algorithm(number);

			System.out.println();
		}

	}

	public static void algorithm(long number) {

		if (number >= 10000000) {

			algorithm(number / 10000000);
			System.out.print(" kuti");
			number %= 10000000;

		}
		if (number >= 100000) {

			algorithm(number / 100000);
			System.out.print(" lakh");
			number %= 100000;

		}
		if (number >= 1000) {

			algorithm(number / 1000);
			System.out.print(" hajar");
			number %= 1000;

		}
		if (number >= 100) {

			algorithm(number / 100);
			System.out.print(" shata");
			number %= 100;

		}
		if (number != 0) {
			System.out.print(" " + number);
		}

	}

}