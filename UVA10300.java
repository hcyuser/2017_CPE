import java.util.*;
class UVA10300{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		for(int i=0;i<c;i++){
			int f = input.nextInt();
			int sum=0;
			for(int w=0;w<f;w++){
				int s = input.nextInt();
				int a = input.nextInt();
				int e = input.nextInt();
				sum  = sum+(s*e);

			}
			System.out.println(sum);
		}

	}

}