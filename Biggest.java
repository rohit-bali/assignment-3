import java.util.Scanner;
class Biggest
{
public static void main(String args[])
{
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter 1st number:");
  a=sc.nextInt();
  System.out.print("Enter 2nd number:");
  b=sc.nextInt();
  System.out.print("Enter 3rd number:");
  c=sc.nextInt();
  if(a>b && a>c)
  {
    System.out.println(a+ " is greater");
  }
  else if(b>a && b>c)
  {
    System.out.println(b+" is greater");
  }
  else
  {
    System.out.println(c+" is greater");
  }

}
}