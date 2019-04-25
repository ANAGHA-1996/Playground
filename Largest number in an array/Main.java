import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int g=0,temp=0;
      for(int j=0;j<size;j++)
      {
         if(g>arr[j])
         {
          continue;
         }
         else
         {
           g=arr[j];
         }    
      }
      System.out.println(g);
    }
}