import java.util.Scanner;
class checkdata{
public static void main(String[]args)
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter any data");
ch=sc.next().charAt(0);
if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
{
  System.out.println("the data is a character");
}
else if(ch>='0'&&ch<='9')
{
  System.out.println("the data is a number");
}
else
{
 System.out.println("the data is a spacial symbol");
 }
}
}