class fibonacciwhile
{
    public static void main(String args[])
    {
        int a=0,b=1,c=0,i=1;
        System.out.print(a+ "," +b);
        while(i<=8)
        {
            c=a+b;
            System.out.print("," +c);
            a=b;
            b=c;
            i++;
        }
    }
}