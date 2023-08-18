class a2b3c110
{
public static void main(String args[])
{
String s=new String("a2b3c110");
char c[]=s.toCharArray();
int i,j,n,sum=0;
for(i=0;i<c.length;i++)
        {
        	if((c[i]>='a' && c[i]<='z')|| (c[i]>='A' && c[i]<='Z'))
        	{
        		n=0;
        		for(j=i+1;j<c.length;j++)
        		{
        			if(c[j]>='0' && c[j]<='9')
        			n=n*10+Character.getNumericValue(c[j]);
        			else
        				break;
        		}
        	      sum=sum+n;
        	}
        }
System.out.print("Sum of numbers is "+sum);
}
}