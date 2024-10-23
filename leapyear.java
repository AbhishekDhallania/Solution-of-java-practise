import java.util.*;;
class leapyear
{
public static void main(String[] args)
{
System.out.println("Enter the year to be checked");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%4==0 && (a%100!=0 || a%400==0 ))
{
System.out.println(a +"is a Leap year");
}
else
{
System.out.println(a +"is not a leap year");
}
}
}