import java.util.Scanner;
abstract class shape
{
int a,b;
abstract void area();
}
class rectangle extends shape
{
void area()
{
System.out.println("Rectangle Area:"+(a*b));
}
}
class triangle extends shape
{
void area()
{
System.out.println("Triangle Area:"+(0.5*a*b));
}
}
class circle extends shape
{
void area()
{
System.out.println("Circle Area:"+(3.14*a*a));
}
}
class shapes
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Rectangle\n2.Triangle\n3.Circle");
System.out.println("Enter Your Choice:");
int num=sc.nextInt();
switch(num)
{
case 1:
rectangle r=new rectangle();
System.out.println("Rectangle");
System.out.println("Length:");
r.a=sc.nextInt();
System.out.println("Breadth:");
r.b=sc.nextInt();
r.area();
break;
case 2:
triangle t=new triangle();
System.out.println("Triangle");
System.out.println("Base:");
t.a=sc.nextInt();
System.out.println("Height:");
t.b=sc.nextInt();
t.area();
break;
case 3:
circle c=new circle();
System.out.println("Circle");
System.out.println("Radius:");
c.a=sc.nextInt();
c.area();
break;
default:
System.out.println("Invalid Input");
}
}
}
