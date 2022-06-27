import java.util.*;
class finding_count
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int c=0;
   int rem;
   System.out.println("enter the number");
   int i=sc.nextInt();
   System.out.println("enter the finding no");
    int a=sc.nextInt();
   while(i!=0)
  {
    rem=i%10;
    if(rem==a)
    c++;
    i=i/10;

}

 if(c>0)
  System.out.println("count the no finding" + c);
  else
  System.out.println("number is not found");
}
}
