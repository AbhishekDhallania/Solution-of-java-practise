import java.util.Scanner;
class reverse
{
public static void main(String[] aa)
{
System.out.print("enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=0;

while(a>0)
{
 int r=a%10;
 b=b*10+r;
 a=a/10;

}
System.out.println(b);

}
}