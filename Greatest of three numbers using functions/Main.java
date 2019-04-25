import java.util.Scanner;
class Main{
  public static int gra(int num1,int num2)
  {
    if(num1>num2)
      return num1;
    else
      return num2;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int g=gra(n1,n2);
      int gr=gra(g,n3);
      System.out.println(gr);
	}
}