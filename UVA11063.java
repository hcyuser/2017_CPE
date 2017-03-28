import java.util.*;
public class UVA11063 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int count = 1;
			int num = sc.nextInt();

			int matrix[] = new int [num+1];
			int record[] = new int [20001];
			boolean check = true;

			for(int i =1;i<=num;i++){

				matrix[i] = sc.nextInt();

				if(matrix[i]<=matrix[i-1] || matrix[i]<1){

					sc.nextLine();
					check = false;
					break;
				}

			}

			if(check==true)

				for(int i =1;i<=num;i++){

					for(int j =i;j<=num;j++)
					{
						int sum = matrix[i]+matrix[j];

						if(record[sum]==0)
							record[sum]=1;


						else if(record[sum]==1){
							check = false;
							break;
						}

					}

				}

			if(!check)
				System.out.println("Case #"+count+": It is not a B2-Sequence.");
			else
				System.out.println("Case #"+count+": It is a B2-Sequence.");

			count++;
			System.out.println();

		}

		sc.close();
	}
}

