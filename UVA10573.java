import java.util.*;
public class UVA10573 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int casesss = Integer.parseInt(input.nextLine());
		for(int i=0;i<casesss;i++){
			String[] inputsss = input.nextLine().split(" ");
			if(inputsss.length==1){
				double a = Double.parseDouble(inputsss[0]);
				if(((a*0.5*a*0.5-a*0.25*a*0.25*2)*Math.PI)>0){
					System.out.printf("%.4f",(double)((a*0.5*a*0.5-a*0.25*a*0.25*2)*Math.PI));
					System.out.println();
				}else{
					System.out.println("Impossible");
				}
				
			}else if(inputsss.length==2){
				double a1 = Double.parseDouble(inputsss[0]);
				double a2 = Double.parseDouble(inputsss[1]);
				double a3 = (a1*2+a2*2)*0.5;
				if((double)((a3*a3-a1*a1-a2*a2)*Math.PI)>0){
					System.out.printf("%.4f",(double)((a3*a3-a1*a1-a2*a2)*Math.PI));
					System.out.println();
				}else{
					System.out.println("Impossible");
				}
				
			}
		}
	}
}
