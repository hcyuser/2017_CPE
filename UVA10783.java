import java.util.Scanner;

public class UVA10783 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for(int i=0;i<count;i++){

			int start =sc.nextInt();

			int last = sc.nextInt();

			int sum=0;


			for(int j=start;j<=last;j++){

				if(j%2!=0){

					sum += j;
				}

			}
			System.out.println("Case "+(i+1)+": "+sum);

		}

		sc.close();
	}

}