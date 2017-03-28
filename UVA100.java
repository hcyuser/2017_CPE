import java.util.Scanner;

public class UVA100{
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int x = input.nextInt();
			int y = input.nextInt();
			int count=0;
			int max = 0;
			boolean ischange = false;
			if(x>y){
				int temp = x;
				x=y;
				y=temp;
				ischange = true;
			}
			for(int i=x;i<=y;i++){
				int w = i;
				while(w!=1){
					if(w%2==1){
						w=3*w+1;
						count++;
					}else{
						w=w/2;
						count++;
					}
				}
				count = count+2;
				if(max<=count){
					max=count;
				}
				count=0;
			}
			if(ischange){
				System.out.println(y+" "+x+" "+(max-1));
			}else{
				System.out.println(x+" "+y+" "+(max-1));
			}
			
			
		}

	}
}