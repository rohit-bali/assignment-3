import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Year:");
year=sc.nextInt();
if(year%4==0)
{
System.out.println(year +" is a leap year");
year++;
}
else
{
	System.out.println(year +" is not a leap year");
}
sc.close();
}
}
