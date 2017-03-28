//Java
import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

class UVA10258{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt()-1; //�`�@�h��Case
		String empty=sc.nextLine(); //��Ū���Ĥ@��ť�
		while(sc.hasNextLine()){
			String st;
			Vector<Data> vector=new Vector<Data>();
			while(sc.hasNextLine() && !(st=sc.nextLine()).equals("")){
				String temp[]=st.split("\\s+"); //�ⶤ��s���B�ҵ����D�ؽs���B�ɶ��B���G���}
				boolean flag=false; //�P�_�����ƬO�_�w�g�إ�
				for(int i=0;i<vector.size();i++){
					if(vector.get(i).getTeamNo()==Integer.parseInt(temp[0])){
						if(temp[3].equals("C")) vector.get(i).countTime(Integer.parseInt(temp[1]),Integer.parseInt(temp[2])); //���G��C�ɭp��ɶ�
						else if(temp[3].equals("I")) vector.get(i).setError(Integer.parseInt(temp[1])); //���G��I�ɬ������~����
						flag=true;
						break;
					}
				}
				if(vector.isEmpty() || !flag){
					Data data=new Data(Integer.parseInt(temp[0]));
					if(temp[3].equals("C")) data.countTime(Integer.parseInt(temp[1]),Integer.parseInt(temp[2])); //���G��C�ɭp��ɶ�
					else if(temp[3].equals("I")) data.setError(Integer.parseInt(temp[1])); //���G��I�ɬ������~����
					vector.add(data); 
				}
			}

			while(!vector.isEmpty()){
				int index=0;
				Data data=vector.firstElement();
				//�W�������(����)�`�D�Ƴ̦h���ɶ��̤֡�����s��
				for(int i=0;i<vector.size();i++){
					if(data.getC()<vector.get(i).getC()){
						data=vector.get(i);
						index=i;
					}else if(data.getC()==vector.get(i).getC()){
						if(data.getTime()>vector.get(i).getTime()){
							data=vector.get(i);
							index=i;
						}else if(data.getTime()==vector.get(i).getTime()){
							if(data.getTeamNo()>vector.get(i).getTeamNo()){
								data=vector.get(i);
								index=i;
							}
						}
					}
				}
				//Output
				System.out.println(vector.get(index).getTeamNo()+" "+vector.get(index).getC()+" "+vector.get(index).getTime());
				vector.remove(index); //�L�X��ƫ�N�R��
				if(vector.size()==0 && (cases--)>0) System.out.println("");
			}

		}
	}
}

class Data{
	private int teamNo; //����s��
	private int time; //�ثe����Ҫ᪺�ɶ�
	private int c; //�����D��
	private boolean problem[]=new boolean[100]; //�D�جO�_�w�g����
	private int error[]=new int[100]; //�D�ؿ��~����
	Data(){
		teamNo=0;
		time=0;
		c=0;
		Arrays.fill(problem,false);
		Arrays.fill(error,0);
	}
	Data(int teamNo){
		this.teamNo=teamNo;
	}
	public void setError(int No){
		error[No-1]++;
	}
	public void countTime(int problemNo,int time){
		if(!problem[problemNo-1]){
			c++;
			this.time+=(time+error[problemNo-1]*20);
			problem[problemNo-1]=true;
		}
	}
	public int getTeamNo(){
		return teamNo;
	}
	public int getC(){
		return c;
	}
	public int getTime(){
		return time;
	}
	public void errorNum(){
		for(int i=0;i<100;i++){
			System.out.println(error[i]);
		}
	}
}