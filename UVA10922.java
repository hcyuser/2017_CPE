import java.util.Scanner;

public class UVA10922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		String str = sc.nextLine();

		if(str.equals("0"))break;

		System.out.print(str+" is ");

		int num =0,t_num=0,count=0;

		for(int i =0;i<str.length();i++)
			num+= Integer.parseInt(str.substring(i, i+1));

		if(num%9==0)count++;

		while(num%9==0 && num>9){

			t_num = num;

			count++;

			num=0;

			while(t_num>0){

				num+=t_num%10;
				t_num/=10;

			}

		}

		System.out.println(num==9?"a multiple of 9 and has 9-degree "+count+".":"not a multiple of 9.");

	}

	sc.close();
	}

}