import java.util.Scanner;
public class Main{
  public static int gcd(int num1,int num2)
  {
    int s=0;
    if(num1<num2)
      s=num1;
    else
      s=num2;
    while(s!=0)
    {
      if((num1%s==0)&&(num2%s==0))
        return s;
      else 
        s--;
    }
    return s;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int g=gcd(n1,n2);
      int gc=gcd(g,n3);
      System.out.println(gc);
	}
}