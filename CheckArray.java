import java.util.Scanner;
class CheckArray {
public static void main(String[] args) {
int a[]={1,4,6,7,8,9,10};
Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.println("Enter number to be searched:");
n=sc.nextInt();
for (i=0;i<7;i++) 
{
for (j=i+1;j<7;j++) 
{
if (a[i]==n) 
{
System.out.println(n+" is present in the array.");
break;
}
}
System.out.println("Not found.");
break;
}
}
}