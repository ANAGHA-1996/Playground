import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int flag1=0,flag2=0;
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int e1=in.nextInt();
      int e2=in.nextInt();
      
      for(int i=0;i<size;i++)
      {
        if(e1==arr[i])
        {
          System.out.println(i);
          flag1=1;
        }
      }
      if(flag1==0)
        System.out.println("-1");
      for(int i=0;i<size;i++)
      {
        if(e2==arr[i])
        {
          System.out.println(i);
          flag2=1;
        }
      }
      if(flag2==0)
        System.out.println("-1");
    }
}