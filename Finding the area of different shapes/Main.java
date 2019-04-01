import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int c=in.nextInt();
      switch(c)
      {
        case 1:
          int s=in.nextInt();
          System.out.print(s*s);
          break;
        case 2:
          int l=in.nextInt();
          int b=in.nextInt();
          int a=l*b;
          System.out.print(a);
          break;
        case 3:
          int b1=in.nextInt();
          int h1=in.nextInt();
          int a1=(b1*h1)/2;
          System.out.print(a1);
          break;
        case 4:
          int r=in.nextInt();
          double a3=3.14*r*r;
          System.out.print(a3);
      }
    }
}