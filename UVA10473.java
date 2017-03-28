import java.util.*;
class UVA10473{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.next();
			int t;
			if(str.charAt(0)=='-'){
				break;
			}else{
				if(str.charAt(0)=='0'&&str.charAt(1)=='x'){
					str = str.substring(2);
					t = Integer.parseInt(str,16);
					System.out.println(t);
				}else{
					String ans="";
					int temp=Integer.parseInt(str);
					while(temp>0){
						int c=temp%16;
						if(c>=10) ans=(char)(65+c%10)+ans;
						else ans=c+ans;
						temp=temp/16;
					}
					System.out.println("0x"+ans);
				}
			}

		}

	}
}