import java.util.Scanner;

public class UVA10193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count =Integer.parseInt(sc.nextLine());

		int pair =1;

		for(int i =0;i<count;i++){

			int S1 = Integer.parseInt(sc.nextLine(), 2);
			int S2 = Integer.parseInt(sc.nextLine(), 2);


			int temp=0;

			//Euclidean algorithm
			while(S1%S2!=0){

				temp = S1%S2;
				S1 = S2;
				S2 = temp;

			}

			System.out.println(S2!=1?"Pair #"+pair+": All you need is love!":"Pair #"+pair+": Love is not all you need!");

			pair++;
		}

		sc.close();
	}

}

