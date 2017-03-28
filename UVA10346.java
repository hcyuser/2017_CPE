import java.util.*;
public class UVA10346 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			int all=0;
			int counter = 0;
			int temp = 0;
			while(temp!=a-(a%b)){
				temp = temp+b;
				counter++;
				all = all+b+1;
				if(counter==b){
					all++;
					counter = 0;
				}
			}
			all = all+a%b;
			System.out.println(all);
		}
	}
}
