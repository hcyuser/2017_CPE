import java.util.*;
class UVA11461{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int i1 = input.nextInt();
			int i2 = input.nextInt();
			int count=0;
			for(int i=i1;i<=i2;i++){
				int temp1 = (int)Math.sqrt(i);
				double temp2 = Math.sqrt(i);
				if((temp2-temp1)==0){
					count++;
				}





			}

			if((i1!=0)&&(i2!=0)){
				System.out.println(count);

			}

		}







	}








}