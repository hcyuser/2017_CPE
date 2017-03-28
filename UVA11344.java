import java.math.*;
import java.util.*;
class main{
	public static void UVA11344(String[] args){
		Scanner input = new Scanner(System.in);
		int ex = input.nextInt();
		
		boolean isOK  = true;
		for(int i=0;i<ex;i++){
		BigInteger goal;
		goal = input.nextBigInteger();
			int tests = input.nextInt();
			BigInteger[] casess = new BigInteger[tests]; 
			for(int z=0;z<tests;z++){
				casess[z] = input.nextBigInteger();
				if((goal.mod(casess[z]))!=BigInteger.valueOf(0)&& (isOK==true)){
					isOK = false;
		
				}


			}
			if(isOK){
				System.out.println(goal+" - "+"Wonderful.");
				isOK=true;
			}else{
				System.out.println(goal+" - "+"Simple.");
				isOK=true;
			}




		}








	}








}