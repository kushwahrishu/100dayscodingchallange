import java.util.Scanner;
class largest_num{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter four numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int num4=sc.nextInt();
  if(num1>num2&&num1>num3)
  {
     if(num1>num4)
      {
         System.out.println("num1 is the largest number");
         System.out.println("num1:"+num1);
       }
      else 
      {
         System.out.println("num4 is the largest number");
         System.out.println("num4:"+num4);
       }
  }
  else if(num2>num3&&num2>num4)
  {
      System.out.println("num2 is the largest number");
      System.out.println("num2:"+num2);
  }
  else if(num3>num4)
  {
      System.out.println("num3 is the largest number");
      System.out.println("num3:"+num3);
  }
  else
  {
     System.out.println("num4 is the largest number");
     System.out.println("num4:"+num4);
  }
}
}