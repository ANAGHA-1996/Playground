import java.util.Scanner;
class Main{
  public static void sub(int size,int arr[])
  {
    for(int i=0;i<size-1;i++)
    {
      for(int j=(i+1);j<size;j++)
      {
        for(int k=(j+1);k<size;k++)
        {
          System.out.print("("+arr[i]+","+" "+arr[j]+","+" "+arr[k]+")"+" ");
        }       
      }
      System.out.println();
    }
    
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      sub(size,arr);
    }
}
