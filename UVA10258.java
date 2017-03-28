//Java
import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

class UVA10258{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt()-1; //總共多少Case
		String empty=sc.nextLine(); //先讀取第一行空白
		while(sc.hasNextLine()){
			String st;
			Vector<Data> vector=new Vector<Data>();
			while(sc.hasNextLine() && !(st=sc.nextLine()).equals("")){
				String temp[]=st.split("\\s+"); //把隊伍編號、所答的題目編號、時間、結果分開
				boolean flag=false; //判斷隊伍資料是否已經建立
				for(int i=0;i<vector.size();i++){
					if(vector.get(i).getTeamNo()==Integer.parseInt(temp[0])){
						if(temp[3].equals("C")) vector.get(i).countTime(Integer.parseInt(temp[1]),Integer.parseInt(temp[2])); //當結果為C時計算時間
						else if(temp[3].equals("I")) vector.get(i).setError(Integer.parseInt(temp[1])); //當結果為I時紀錄錯誤次數
						flag=true;
						break;
					}
				}
				if(vector.isEmpty() || !flag){
					Data data=new Data(Integer.parseInt(temp[0]));
					if(temp[3].equals("C")) data.countTime(Integer.parseInt(temp[1]),Integer.parseInt(temp[2])); //當結果為C時計算時間
					else if(temp[3].equals("I")) data.setError(Integer.parseInt(temp[1])); //當結果為I時紀錄錯誤次數
					vector.add(data); 
				}
			}

			while(!vector.isEmpty()){
				int index=0;
				Data data=vector.firstElement();
				//名次表較依(答對)總題數最多→時間最少→隊伍編號
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
				vector.remove(index); //印出資料後就刪除
				if(vector.size()==0 && (cases--)>0) System.out.println("");
			}

		}
	}
}

class Data{
	private int teamNo; //隊伍編號
	private int time; //目前隊伍所花的時間
	private int c; //答對題數
	private boolean problem[]=new boolean[100]; //題目是否已經答對
	private int error[]=new int[100]; //題目錯誤次數
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