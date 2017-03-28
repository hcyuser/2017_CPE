//Java
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

class  UVA406{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//�ϥ�Vector�إ߽�ƪ�C�ϥ�Eratosthenes�إ߽�ƪ�C
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
			
			//��X�b1~N�̭����h�ֽ�ơC
			int size=0;
			Iterator<Integer> iterator=vector.iterator();
			while(iterator.hasNext()){
				if(iterator.next()<=N) size++;
				else break;
			}
			
			/*��X���:
			  1. �D�حn�D��X C*2 or C*2-1 (��)�q�����V���k��������ơC
			  2. (�`��ƭӼ�-�ݿ�X����ƭӼ�)=�ѤU�Y������X�������C
			  3. �ѤW�������l/2=�L�X��ƶ}�l�I�C�`��ƭӼ�-(�W�����l/2)=�L�X��ƪ������I�C
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