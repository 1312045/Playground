import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int  great;
      if(n1>n2)
        great=n1;
      else great=n2;
      
      if(great>n3)
        System.out.print(great);
      else
        System.out.print(n3);
    }
}