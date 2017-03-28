import java.util.*;
class UVA10324{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int c = 1;
		while(input.hasNext()){
			System.out.println("Case "+c+":");
			c++;
			String str = input.next();
			int casess = Integer.parseInt(input.next());
			int chk1=0,chk2=0;
			for(int i=0;i<casess;i++){
				boolean isY = true;
				chk1 =  Integer.parseInt(input.next());
				chk2 =  Integer.parseInt(input.next());
				char temp = str.charAt(Math.max(chk1,chk2));
				for(int w=Math.min(chk1,chk2);w<=Math.max(chk1,chk2);w++){
					if(temp!=str.charAt(w)){
						isY = false;
					}
				}
				if(isY){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}


		}

	}

}