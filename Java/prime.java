class prime
{
public static void main(String...s)
{
int n,i;
n=Integer.parseInt(s[0]);

for(i=2;i<n;++i)
{
if(n%i==0)
break;
}

if(i==n)
System.out.println("\nNumber is prime");
else
System.out.println("\nNumber is not prime");
}
}
