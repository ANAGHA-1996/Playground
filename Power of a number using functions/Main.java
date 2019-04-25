import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int b=in.nextInt();
    int e=in.nextInt();
    fun(b,e);
  }
    public static void fun(int b ,int e)
    {
      long result=1;
      while(e!=0)
      {
        result*=b;
        --e;
      }
      System.out.println(result);
      
    }
}