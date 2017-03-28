import java.util.*;
public class UVA10424 {
	public static void main(String[] args){
		Scanner  input  = new Scanner(System.in);
		while(input.hasNext()){
			String n1 = input.nextLine();
			String n2 = input.nextLine();
			int a1 = tonum(n1);
			int a2 = tonum(n2);
			a1 = lcompute(a1);
			a2 = lcompute(a2);
			double pr;
			if(a1>a2){
				pr = 100.0*a2/a1;
			}else{
				pr = 100.0*a1/a2;
				}
			System.out.printf("%.2f",pr);
			System.out.println(" %");
		}
	}
	public static int tonum(String aaa){
		String temp = aaa.toLowerCase();
		int all = 0;
		for(int i=0;i<temp.length();i++){
			if(Character.isLetter(temp.charAt(i))){
				all = all + (temp.charAt(i)-'a'+1);
			}
		}

		return all;
	}
	public static int lcompute(int www){
		
		
		while(www>=10){
			www = www%10+www/10;
			
		}
		return www;
	}
}
