import java.util.*;
public class UVA10235 {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		while(input.hasNext()){
			int test = input.nextInt();
			int temp = test;
			int inverse = 0;
			while(temp!=0){
				inverse =inverse*10+ temp%10;
				temp = temp/10;
			}
			if((test==inverse)&&isPrime(test)){
				System.out.println(test+" is prime.");
			}else if(isPrime(test)&&isPrime(inverse)){
				System.out.println(test+" is emirp.");
			}else if(isPrime(test)&&!isPrime(inverse)){
				System.out.println(test+" is prime.");
			}else{
				System.out.println(test+" is not prime.");
			}
			
			
		}
	}
	public static boolean isPrime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
}
