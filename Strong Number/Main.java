import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      int num,sum=0,rem,temp;
      Scanner in=new Scanner(System.in);
      num=in.nextInt();
      temp=num;
       while(num>0)
       {
         rem=num%10;
        int fact=1;
      for(int i=1;i<=rem;i++)
      {
        fact=fact*i;  
      }
         num=num/10;
         sum=sum+fact;
       }
      if(temp==sum)
      {
	 System.out.print("Yes");
      }
      else
      {
         System.out.print("No");
    }
    }
}