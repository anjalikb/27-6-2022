import java.util.*;
class max_no
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int k=0;
  int rem=0;
  System.out.println("enter the no");
  int n=sc.nextInt();
  while(n!=0)
  {
   rem=n%10;
     if(rem>k)
     k=rem;
    n=n/10;
   }
   System.out.println("the grater no is = " +k);
}
}