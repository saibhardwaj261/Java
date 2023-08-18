class primepat
{
public static void main(String args[])
{
int i=0,j=0,k=0,n=0,c=0,cn=1;

for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
for(n=2;n>0;n++)
{
    cn++;
    n=cn;
c=0;
for(k=2;k<=n/2;k++)
{
if(n%k==0)
{
c++;
break;
}
}
if(c==0)
{
System.out.print(n+ " ");
break;
}
}
}
System.out.println();
}
}
}