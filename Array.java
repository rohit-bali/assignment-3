class Array {
public static void main(String[] args) {
int a[]={1,1,1,1,0,0,1,0};
int n,i,j,temp;
for (i=0;i<8;i++) 
{
for (j=i+1;j<8;j++) 
{
if (a[i]>a[j]) 
{
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
System.out.print("Ascending Order:{");
for (i=0;i<7;i++) 
{
System.out.print(a[i] + ",");
}
System.out.print(a[7]);
System.out.print("}");
}
}