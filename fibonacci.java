import java.util.*;
class fibonacci
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
int b=1;
int temp;
System.out.println(a);

for(int i=0;i<n-1;i++)
{

temp=a+b;
a=b;
b=temp;

System.out.println(a);

}
}
}
