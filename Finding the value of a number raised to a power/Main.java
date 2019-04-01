import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int e=in.nextInt();
      int m=n;
      if(e>1)
      {
          for(int i=1;i<e;i++)
          {
            m=m*n;
          }
        }
      System.out.print(m);
    }
}