//Java
import java.util.Scanner;
public class UVA11309{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			String st=sc.next();
			int h=(st.charAt(0)-48)*10+st.charAt(1)-48; //時
			int m=(st.charAt(3)-48)*10+st.charAt(4)-48; //分

			while(true){
				m++;
				h=(m/60+h)%24;
				m=m%60;
				String temp=Integer.toString(h*100+m); //小時*100+分→轉成字串判斷是否回文
				StringBuilder temp2=new StringBuilder(temp);
				if(temp.equals(temp2.reverse().toString()))break; //當回文就停止
			}
			//Output
			System.out.println(""+(h/10)+(h%10)+":"+(m/10)+(m%10));
		}
	}
}