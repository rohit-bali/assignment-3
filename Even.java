import java.util.Scanner;
class Even
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n,i;
  System.out.print("ENTER LIMIT=");
  n=sc.nextInt();
  for(i=0;i<n;i++)
  {
  if(i%2==0)
  {
    System.out.println(i+" is Even.");
  }
  }
}
}