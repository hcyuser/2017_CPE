import java.util.*;
class UVA10282{
	public static void main(String[] args){
		boolean isOK = false;
		Scanner input = new Scanner(System.in);
		HashMap<String,String> hm = new HashMap<String,String>();
		while(input.hasNext()){
			String str2 = input.nextLine();
			String[] str = str2.split(" ");
			if((str.length==2)&&(!str2.equals(""))){
				hm.put(str[1],str[0]);
				
			}else if(str.length==1){
				if(hm.get(str[0])!=null) System.out.println(hm.get(str[0]));
					else if(isOK) {System.out.println("eh");}
					else{
						isOK = true;
					}
			
			}
			
		}
	
	}



}