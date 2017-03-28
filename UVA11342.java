//Java
import java.util.Scanner;
import java.util.Vector;

class UVA11342{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			double k=sc.nextDouble();
			Vector<Integer> vector=new Vector<Integer>();
			boolean flag=false;
			int powM=(int)Math.sqrt(k); //��Xk����Ʈڸ��C

			//��Xa^2+b^2+c^2=k�C
			for(int j=0;j<=powM;j++){
				double tempK=k-(j*j); //b^2+c^2=k-a^2�C
				for(int z=0;z<=powM;z++){
					double tempK2=tempK-(z*z); //c^2=k-b^2�C
					int temp=(int)Math.sqrt(tempK2);
					//��c�i�H�}����Ʈڸ��ɡA�N��ŦX�D�N�C
					if((temp*temp)==(int)tempK2){
						vector.add(j);
						vector.add(z);
						vector.add(temp);
						flag=true;
						break;
					}
				}
				if(flag) break;
			}

			//Output
			if(vector.size()==3) System.out.println(vector.get(0)+" "+vector.get(1)+" "+vector.get(2));
			else System.out.println("-1");
		}
	}
}