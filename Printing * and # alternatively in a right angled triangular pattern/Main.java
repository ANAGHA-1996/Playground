import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
    int num=1;
      for (int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(num%2 == 1)
           		System.out.print("*");
          else
          	System.out.print("#");
          num++;
        }
         
         System.out.print("\n");

      }

    }
}