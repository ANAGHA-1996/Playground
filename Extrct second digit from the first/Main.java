import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=n;
      while(f>100)
      {
         f=f/10;
      }
      f=f%10;
      
      System.out.println(f);
	}
}