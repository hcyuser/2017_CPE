import java.util.Scanner;

public class UVA948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count =sc.nextInt();

		while(count-->0){

			int box[]=new int[1000];

			box[0]=0;box[1]=1;

			for(int i =2;i<1000;i++){
				box[i]=box[i-1]+box[i-2];
			}

			int num= sc.nextInt();

			System.out.print(num+" = ");

			int i;

			for(i =1;box[i]<=num;i++);

			i--;

			for(int j=i;j>1;j--){

				if(num>=box[j])
				{ 
					num-=box[j];
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.print(" (fib)");
			System.out.println();

		}

		sc.close();
	}

}