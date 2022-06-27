import java.util.*;
class factorial1
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the factorial no =");
   int a=sc.nextInt();
   int i=1;
   int fact=1;
      while(i<=a)
     {
       fact=fact*i;
       i++;
     }  
       System.out.println(" factorial of no " +fact);
}
}
