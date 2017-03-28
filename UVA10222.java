import java.util.Scanner;
public class UVA10222 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str,keyboard;
		int len;
		keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while(input.hasNextLine()){
			str = input.nextLine();
			len = str.length();
			str = str.toLowerCase();
			for(int i = 0;i<len;i++ ){
				if(str.charAt(i)==' ')System.out.print(" ");
				else{
				System.out.print(keyboard.charAt(keyboard.indexOf(str.charAt(i))-2));
				}
			}
			System.out.println();
		}

	}

}