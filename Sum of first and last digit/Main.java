import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int l=n%10;
      int f=n;
      while(f>10)
      {
         f=f/10;
      }
      int sum=l+f;
      System.out.println(sum);
	}
}