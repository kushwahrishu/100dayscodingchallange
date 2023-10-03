import java.util.Scanner;
class divisible_3_7{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.");
int x=sc.nextInt();
if (x%3==0 && x%7==0)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}