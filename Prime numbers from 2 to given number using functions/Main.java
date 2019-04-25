import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      fun(n);
	}
  public static void fun(int n)
  {
    String prime="";
    for(int i=2;i<=n;i++)
    {
      int count=0;
      for(int num=i;num>=1;num--)
      {
      		if(i%num == 0)
      		{
       			 count++;
            }
      }
      if(count==2)
      {
         prime=prime+i+"\n";
      	
      }
    }
    System.out.print(prime);
    
  }
}