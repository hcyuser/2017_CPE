//Java
import java.util.Scanner;
 
class UVA12019{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int month[]={31,28,31,30,31,30,31,31,30,31,30,31}; //�C�Ӥ�ѼơC
            String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //�P����C
            int M=sc.nextInt();
            int D=sc.nextInt(); 
            D=D+4; //�վ㦨0=Monday 1=Tuesday ...�C
            for(int j=1;j<M;j++){
                D=D+month[j-1];
            }
             
            //Output
            System.out.println(week[D%7]);
        }
    }
}