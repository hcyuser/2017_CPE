import java.util.Scanner;

class UVA10550{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		while(sc.hasNext()){
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
			if(a==0 && b==0 && c==0 && d==0) break;
			int degree=1080; //第一步驟、第三步驟所轉的圈數。

			degree+=(a>=b)?(a-b)*9:(40+a-b)*9; //第二步驟
			degree+=(b<=c)?(c-b)*9:(40+c-b)*9; //第四步驟
			degree+=(c>=d)?(c-d)*9:(40+c-d)*9; //第五步驟

			//Output
			System.out.println(degree);
		}
	}
}