import java.util.Scanner;

public class UVA10242 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			double a_x = sc.nextDouble();
			double a_y = sc.nextDouble();
			double b_x = sc.nextDouble();
			double b_y = sc.nextDouble();
			double c_x = sc.nextDouble();
			double c_y = sc.nextDouble();
			double d_x = sc.nextDouble();
			double d_y = sc.nextDouble();

			double answer_x = 0 , answer_y = 0;

			if(a_x == c_x && a_y == c_y ){

				answer_x = b_x - a_x + d_x;
				answer_y = b_y - a_y + d_y;

				System.out.printf("%.3f %.3f",answer_x,answer_y);
				System.out.println();

			}

			else if(a_x == d_x && a_y == d_y){

				answer_x = b_x - a_x + c_x;
				answer_y = b_y - a_y + c_y;

				System.out.printf("%.3f %.3f",answer_x,answer_y);
				System.out.println();

			}

			else if(b_x == c_x && b_y == c_y){

				answer_x = a_x - b_x + d_x;

				answer_y = a_y - b_y + d_y;

				System.out.printf("%.3f %.3f",answer_x,answer_y);
				System.out.println();

			}

			else {

				answer_x = a_x - b_x + c_x;
				answer_y = a_y - b_y + c_y;

				System.out.printf("%.3f %.3f",answer_x,answer_y);
				System.out.println();

			}

		}
		sc.close();
	}

}