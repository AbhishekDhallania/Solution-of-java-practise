import java.util.Scanner;
class digitcount
{
public static void main(String[] aa)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the digit");
int a=sc.nextInt();
int count=0;
while(a>0)
{
count++;
a=a/10;

}
System.out.print(+count);
}
}