class palindrom
{
  public static void main(String args[])
{
   int n=121,rm;
   int i;
   i=n;
   int rev=0;
  while(i!=0)
{
   rm=i%10;
   rev=rev*10+rm;
   i=i/10;
 }

   if(n==rev)
   System.out.println(rev + " these is palindrom");

   else 

   System.out.println( rev + "This is not palindrom");
}
}

  
   