import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
  int num,r,rev=0,temp;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any Number:");
  num=sc.nextInt();
  temp=num;
   while(num>0)
   {
        r=num%10;
        rev=(rev*10)+r;
        num=num/10;
   }
    
    if(temp==rev)
    {
        System.out.println(temp+" is Palindrome.");
	}
    else
	{
        System.out.println(temp+" is not Palindrome.");
	}
 }
 }