import java.util.Scanner;

public class UVA10221 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			int distance = sc.nextInt();

			double degree = sc.nextInt();

			String pattern =sc.next();

			double arc,chord;

			int radius= 6440+distance; 

			if(pattern.equals("deg"))
				degree=Math.min(360-degree, degree);

			else
				degree/=60;

			arc = 2 * radius * Math.PI * (degree/360);

			chord = 2 * radius * Math.sin(degree * Math.PI /360);

			System.out.printf("%.6f ", arc);


			System.out.printf("%.6f", chord);


			System.out.println();
		}

		sc.close();
	}

}

