import java.util.*;
public class UVA10696 {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
	        int number;
	        while((number=sc.nextInt())!=0){
	            System.out.println("f91("+number+") = "+f91(number));
	        }
	    }
	    public static int f91(int number){
	         
	        if(number<=100) 
	            return f91(f91(number+11));
	        else
	            return number-10;
	         
	    }
	}

