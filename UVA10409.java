import java.util.Scanner;

public class UVA10409 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			int count = Integer.parseInt(sc.nextLine());

			if(count == 0)break;

			int top = 1,north = 2 , west = 3;

			int temp = 0;

			for(int i=0;i<count;i++)
			{

				String s = sc.nextLine();

				switch (s){

				//temp = top(replace all repeat)
				case ("north"):
				{

					temp = top;
					top = 7-north;
					north = temp;
					break;

				} 
				case ("east"):
				{

					temp = top;
					top = west ; 
					west = 7-temp;
					break;

				}
				case ("south"):
				{

					temp = top;
					top = north;
					north = 7-temp;
					break;

				}
				case ("west"):
				{

					temp = top;
					top = 7 -west;
					west = temp;
					break;

				}

				}

			}
			System.out.println(top);

		}

		sc.close();
	}

}