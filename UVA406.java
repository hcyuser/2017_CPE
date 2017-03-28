//Java
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

class  UVA406{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//使用Vector建立質數表。使用Eratosthenes建立質數表。
		Vector<Integer> vector=new Vector<Integer>();
		for(int i=1;i<=1000;i++){
			vector.add(i);
		}
		for(int i=2;i<=1000;i++){
			for(int j=0;j<vector.size();j++){
				if(vector.get(j)%i==0 && vector.get(j)!=i) vector.remove(j);
			}
		}
		
		while(sc.hasNextInt()){
			int N=sc.nextInt();
			int C=sc.nextInt();
			
			//找出在1~N裡面有多少質數。
			int size=0;
			Iterator<Integer> iterator=vector.iterator();
			while(iterator.hasNext()){
				if(iterator.next()<=N) size++;
				else break;
			}
			
			/*輸出資料:
			  1. 題目要求輸出 C*2 or C*2-1 (個)從中間向左右延伸的質數。
			  2. (總質數個數-需輸出的質數個數)=剩下頭尾不輸出的部分。
			  3. 由上面的式子/2=印出質數開始點。總質數個數-(上面式子/2)=印出質數的結束點。
			*/
			System.out.print(N+" "+C+":");
			int s=0;
			if(size%2==0){
				if((C*2)<size) s=(size-C*2)/2; 
				for(int i=s;i<size-s;i++){
					System.out.print(" "+vector.get(i));
				}
			}else{
				if((C*2-1)<size) s=(size-(C*2-1))/2;
				for(int i=s;i<size-s;i++){
					System.out.print(" "+vector.get(i));
				}
			}
			System.out.println("");
			System.out.println("");
		}
		
	}
}