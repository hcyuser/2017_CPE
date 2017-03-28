import java.util.*;
class UVA10260{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.nextLine();
			boolean is1 = false;
			boolean is2 =false;
			boolean is3 = false;
			boolean is4 = false;
			boolean is5 = false;
			boolean is6 = false;
			for(int i =0;i<str.length();i++){

				if(str.charAt(i)=='B'||str.charAt(i)=='F'||str.charAt(i)=='P'||str.charAt(i)=='V')
				{
					if(!is1){
						System.out.print("1"); 
						is1 = true;
						is2 = false;
						is3 = false;
						is4= false;
						is5 = false;
						is6= false;}
				}else if(str.charAt(i)=='C'||str.charAt(i)=='G'||str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='Q'||str.charAt(i)=='S'||str.charAt(i)=='X'||str.charAt(i)=='Z'){
					if(!is2){
						System.out.print("2");
						is1 = false;
						is2 = true;
						is3 = false;
						is4= false;
						is5 = false;
						is6= false;}
				}else if(str.charAt(i)=='D'||str.charAt(i)=='T'){
					if(!is3){
						System.out.print("3");
						is1 = false;
						is2 = false;
						is3 = true;
						is4= false;
						is5 = false;
						is6= false;}
				}else if(str.charAt(i)=='L'){
					if(!is4){
						System.out.print("4");
						is1 = false;
						is2 = false;
						is3 = false;
						is4= true;
						is5 = false;
						is6= false;}
				}else if(str.charAt(i)=='N'||str.charAt(i)=='M'){

					if(!is5){
						System.out.print("5");
						is1 = false;
						is2 = false;
						is3 = false;
						is4= false;
						is5 = true;
						is6= false;}
				}else if(str.charAt(i)=='R'){
					if(!is6){
						System.out.print("6");
						is1 = false;
						is2 = false;
						is3 = false;
						is4= false;
						is5 = false;
						is6= true;}
				}else{
					is1 = false;
					is2 = false;
					is3 = false;
					is4= false;
					is5 = false;
					is6= false;
				}

			}
			System.out.println();

		}

	}


}