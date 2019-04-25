import java.util.Scanner;
class Main{
  public static void sum(int size,int arr[],int val)
  {
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        int total=arr[i]+arr[j];
        if(total==val)
          System.out.println(arr[i]+","+" "+arr[j]);
      }
    }
  }
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int val=in.nextInt();
      sum(size,arr,val);
    }
}
