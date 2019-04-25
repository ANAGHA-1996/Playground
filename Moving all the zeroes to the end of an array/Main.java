import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int count=0;
      for(int k=0;k<n;k++)
      {
        if(arr[k]!=0)
          System.out.print(arr[k]+" "); 
        else
          count++;
      }
      for(int j=0;j<count;j++)
      {
        System.out.print("0"+" ");
      }

    }
}

