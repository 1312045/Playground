import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    while(n1>=100)
    {
      n1=n1/10;
    }
    int n2=n1%10;
    System.out.print(n2);
  }
}