import java.util.Scanner;

class UVA10642{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			int x1=sc.nextInt(),y1=sc.nextInt();
			int x2=sc.nextInt(),y2=sc.nextInt();

			long count=0; //���M��J���I���|�W�Lint���d��A���O�Z���|�A�ҥH�ݭn�Ψ�long�C
			//(0,0)����Ĥ@���I���Z��(�۴�)�C
			for(int j=0;j<(x1+y1);j++){
				count=count-j-1;
			}
			count=count-x1-1;

			//(0,0)����ĤG���I���Z��(�ۥ[)�C
			for(int j=0;j<(x2+y2);j++){
				count=count+j+1;
			}
			count=count+x2+1;

			System.out.println("Case "+(i+1)+": "+count);
		}
	}
}