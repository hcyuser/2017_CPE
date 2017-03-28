import java.util.*;
public class UVA10474 {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		int count = 1;
		while(input.hasNext()){
			int num = input.nextInt();
			if(num!=0){
				int ca = input.nextInt();
				int[] caa = new int[num];
				for(int i=0;i<num;i++){
					caa[i] = input.nextInt();
				}
				Arrays.sort(caa);
				System.out.println("CASE# "+count+":");
				count++;
				for(int w=0;w<ca;w++){
					int test = input.nextInt();
					boolean isPrinted = false;
					boolean isF = false;
					for(int z=0;z<num;z++){
						if(caa[z]==test&&(!isPrinted)){
							System.out.println(test+" found at "+(z+1));
							isF = true;
							isPrinted = true;
							
						}
					}
					if(!isF){
						System.out.println(test+" not found");
					}
				}
			}else{
				break;
			}
		}
		
		
		
		
		
		
	}
}
