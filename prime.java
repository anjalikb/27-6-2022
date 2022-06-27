class prime
{
  public static void main(String args[])
{
  int n=11;
  int i=2;
  while(i<=n)
  {
     if(n%i==0)
      break;
      i++;
   }
     
     if(n==i)
    System.out.println(n+ " this is prime no");
    else 
    System.out.println(n+ "this is not prime no");
}
}
  