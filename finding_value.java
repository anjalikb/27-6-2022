import java.util.*;
class finding_value
{
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
    int k=3;
    int c=0;
    int rem;
    int i=sc.nextInt();
   
    while(i!=0)
{
    rem=i%10;
     if(rem==k)
    {
     c=1;
     break;
    }
 i=i/10;
 }
   if (c==1)
      System.out.println("number is found");
    else 
       System.out.println("number is not found");
  }
} 