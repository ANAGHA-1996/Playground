import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n%1000;
      int b=a%100;
      int c=b/10;
      System.out.println(c);
	}
}