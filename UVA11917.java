import java.util.*;
public class UVA11917 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int totalcase = input.nextInt();
		for(int i=0;i<totalcase;i++){
			int nsubject = input.nextInt();
			String[] subject = new String[nsubject];
			int[] date = new int[nsubject];
			for(int w=0;w<nsubject;w++){
				subject[w] = input.next();
				date[w] = input.nextInt();
			}
			int currentdate = input.nextInt();
			String currentsubject = input.next();
			boolean isSubject = false;
			int counter = 0;
			for(int x=0;x<nsubject;x++){
				if(currentsubject.equals(subject[x])){
					isSubject = true;
					counter = x;
				}
			}
			if(isSubject){
				if(currentdate>=(date[counter])){
					System.out.println("Case "+(i+1)+": Yesss");
				}else if(currentdate+5>=(date[counter])){
					
					System.out.println("Case "+(i+1)+": Late");
				}else{
					System.out.println("Case "+(i+1)+": "+"Do your own homework!");
				}
			}else{
				System.out.println("Case "+(i+1)+": "+"Do your own homework!");
			}
			
		}
	}
}
