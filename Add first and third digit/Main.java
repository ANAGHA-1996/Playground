import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int n=num1/100;
      int h=num1%10;
      System.out.println(n+h);
                       
	}
}