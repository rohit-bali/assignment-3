import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int a,b,sum;
Scanner sc=new Scanner(System.in);
System.out.print("Enter First number:");
a=sc.nextInt();
System.out.print("Enter Second number:");
b=sc.nextInt();
sum=a+b;
System.out.print("Your Sum:" +sum);
sc.close();
}
}
