import java.util.*;
class Technologynumber
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number....");
int n=s.nextInt();
int d=0,n2=n;
double first=0,last=0,pro=0;

for(;n2>0;n2/=10)
{
d++;
}
first=n/(Math.pow(10,d/2));
last=n%(Math.pow(10,d/2));
first=(int)first;
last=(int)last;
pro=(first+last)*(first+last);

if(n==pro)
System.out.println(n+ " is Technology number");
else
System.out.println(n+ " is not Technology number");
}
}