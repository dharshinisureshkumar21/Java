import java.util.Scanner;
interface Calculator
{
int add(int a,int b);
int sub(int a,int b);
int mul(int a,int b);
int div(int a,int b);
}
class Operation implements Calculator
{
public int add(int a,int b)
{
  return a+b;
}
public int sub(int a,int b)
{
  return a-b;
}
public int mul(int a,int b)
{
  return a*b;
}
public int div(int a,int b)
{
  return a/b;
}
}
class Exp
{
public static void main(String [] args)
{
Operation o=new Operation();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("ARITHMETIC OPERATIONS");
System.out.println("1.ADDITION");
System.out.println("2.SUBTRACTION");
System.out.println("3.MULTIPLICATION");
System.out.println("4.DIVISION");
System.out.println("Exit");
System.out.println("Enter your choice:");
int ch=sc.nextInt();
if(ch==1)
{
System.out.println("Enter a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Result="+o.add(a,b));
}
else if(ch==2)
{
System.out.println("Enter a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Result="+o.sub(a,b));
}
else if(ch==3)
{
System.out.println("Enter a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Result="+o.mul(a,b));
}
else if(ch==4)
{
System.out.println("Enter a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Result="+o.div(a,b));
}
else if(ch==5)
{
System.out.println("Program ended");
break;
}
else
{
System.out.println("Invalid choice");
}
}
}
}
