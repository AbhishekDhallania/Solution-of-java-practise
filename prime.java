import java.util.Scanner;
class prime
{
public static void main(String[] aa)
{
System.out.print("Enter a no.to be checked");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int temp=0;
for(int i=2;i<=a/2;i++)
{
if((a%i)==0)
{
temp++;
break;
}
}
if(temp==0 && a!=1)
{
System.out.print("prime");
}

else
{
System.out.println("not prime");
}

}
}