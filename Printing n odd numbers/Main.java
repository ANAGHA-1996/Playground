import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=1,count=0;
      for(int i=1;i<=(n*2)-1;i++)
      {
        	if(num%2==1)
            {
          		System.out.println(num);
          		count++;
            }
        num++;
        
      }
	}
}