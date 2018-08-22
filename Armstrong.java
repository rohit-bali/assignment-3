import java.util.Scanner;  
class Armstrong {  
public static void main(String[] args) {  
	
    int num=0,a,temp,n;  
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:");
    n=sc.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    num=num+(a*a*a);  
    }  
    if(temp==num)  
    System.out.println(temp+" Armstrong number");   
    else  
        System.out.println(temp +" not an Armstrong number");   
   }  

}

