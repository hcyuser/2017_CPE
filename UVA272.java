import java.util.Scanner;

public class UVA272{
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean flag = false;
      while(scan.hasNext()){
          String s = scan.nextLine();
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='\"'){
                  if(flag == true){
                      flag=false;
                      System.out.print("\'\'");
                  }else{
                      flag=true;
                      System.out.print("``");
                  }
                  
              }
              else{System.out.print(s.charAt(i));}
          }
          System.out.println();
      }
  }
}