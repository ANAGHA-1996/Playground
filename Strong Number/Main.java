import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fact=1,str=0,rem=0;
      int num=n;
      while(n>0)
      {
        rem=n%10;
        fact=1;
        for(int i=1;i<=rem;i++)
        {
        	fact*=i;
        }
        str+=fact;
        n=n/10;
      }
      if(num == str)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}