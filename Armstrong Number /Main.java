import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0,num,arm=0;
      int rem=0;
      num=n;
      int num1=n;
      while(n>0)
      {
        n=n/10;
        ++count;
      }
      
      for(;num!=0;num/=10)
      {
        rem=num%10;
        arm=arm+(rem*rem*rem) ;
        
      }
      
      if(num1 == arm)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}