import java.util.*;
class UVA10699{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int c = input.nextInt();
			if(c==0){
				break;
			}else{
				int counter = 0;
				for(int x=2;x<=c;x++){
					if((c%x)==0){
						if(isPrime(x)){
							counter++;
						}
					}
				}
				System.out.println(c+" : "+counter);
			}

		}

	}
	public static boolean isPrime(int p){
		boolean isP = true;
		for(int i=2;i<=(p/2);i++){
			if((p%i)==0){
				isP = false;
				break;
			}
		}
		return isP;

	}


}