//Java
import java.util.Scanner;

class UVA10415{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int cases=Integer.parseInt(sc.nextLine());
		for(int i=0;i<cases;i++){
			//�����C�ӭ^��r���ҷ|���쪺��C
			String finger[]={"c0111001111","d0111001110","e0111001100","f0111001000","g0111000000","a0110000000","b0100000000","C0010000000","D1111001110","E1111001100","F1111001000","G1111000000","A1110000000","B1100000000"};

			int count[]=new int[10]; //�����C����ҫ������ơC
			String st=sc.nextLine();
			String current="0000000000"; //�ثe����ҫ�����C
			for(int j=0;j<st.length();j++){
				String temp="";
				//��X�ثe���^��r���һݭn�ת���
				for(int k=0;k<finger.length;k++){
					if(st.charAt(j)==finger[k].charAt(0)){
						temp=finger[k].toString();
						break;
					}
				}
				//�P�_���ƬO�_++�C
				StringBuilder stB=new StringBuilder(temp);
				temp=stB.substring(1);
				for(int k=0;k<10;k++){
					if(current.charAt(k)!=temp.charAt(k) && temp.charAt(k)=='1') count[k]++;
				}
				current=temp;
			}

			//Output
			for(int j=0;j<10;j++){
				if(j!=9) System.out.print(count[j]+" ");
				else System.out.print(count[j]);
			}
			System.out.println("");
		}
	}
}