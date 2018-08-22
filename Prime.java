import java.util.Scanner;  
class Prime {  
public static void main(String[] args) {  
int n,i,j,count=0;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the limit : "); 
n=sc.nextInt();
for(i=2;i<n;i++)
{
count=0;
for(j=2;j<i;j++)
{
if(i%j==0)
count=1;
}
if(count==0)
System.out.println(i +" is Prime Number.");
}
}
}
