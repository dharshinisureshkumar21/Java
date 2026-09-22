import java.util.Scanner;
class Employee
{
String emp_name,mail_id,ad,mob_no;
int emp_id;
double BP,DA,HRA,PF,SC,GS,NS;
Scanner sc=new Scanner(System.in);
void getdetails()
{
System.out.println("Employee Name:");
emp_name=sc.nextLine();
System.out.println("Employee Mail ID:");
mail_id=sc.nextLine();
System.out.println("Employee Address:");
ad=sc.nextLine();
System.out.println("Employee Mobile Number:");
mob_no=sc.nextLine();
System.out.println("Employee ID:");
emp_id=sc.nextInt();
System.out.println("Employee Basic Pay:");
BP=sc.nextDouble();
}
void display(String designation)
{
System.out.println("---------PAY BILL----------");
System.out.println("Designation:"+designation);
System.out.println("Employee Name:"+emp_name);
System.out.println("Employee ID:"+emp_id);
System.out.println("Employee Address:"+ad);
System.out.println("Employee Mail ID:"+mail_id);
System.out.println("Employee Mobile Number:"+mob_no);
System.out.println("EmployeeBasic Pay:"+BP);
System.out.println("Employee DA:"+DA);
System.out.println("Employee HRA:"+HRA);
System.out.println("Employee PF:"+PF);
System.out.println("Employee SC:"+SC);
System.out.println("----------------SALARY---------------");
System.out.println("Employee Gross Salary:"+GS);
System.out.println("Employee Net Salary:"+NS);
}
}
class programmer extends Employee
{
void calsal()
{
DA=BP*97/100;
HRA=BP*10/100;
PF=BP*12/100;
SC=BP*1/100;
GS=BP+DA+HRA;
NS=GS-PF-SC;
}
}
class assistant extends Employee
{
void calsal()
{
DA=BP*110/100;
HRA=BP*20/100;
PF=BP*12/100;
SC=BP*5/100;
GS=BP+DA+HRA;
NS=GS-PF-SC;
}
}
class associate extends Employee
{
void calsal()
{
DA=BP*130/100;
HRA=BP*30/100;
PF=BP*12/100;
SC=BP*10/100;
GS=BP+DA+HRA;
NS=GS-PF-SC;
}
}
class professor extends Employee
{
void calsal()
{
DA=BP*140/100;
HRA=BP*40/100;
PF=BP*12/100;
SC=BP*15/100;
GS=BP+DA+HRA;
NS=GS-PF-SC;
}
}
class emp
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Professor");
System.out.println("Enter Your Choice:");
int num=sc.nextInt();
switch(num)
{
case 1:
programmer p=new programmer();
p.getdetails();
p.calsal();
p.display("programmer");
break;
case 2:
assistant ap=new assistant();
ap.getdetails();
ap.calsal();
ap.display("assistant");
break;
case 3:
associate asp=new associate();
asp.getdetails();
asp.calsal();
asp.display("associate");
break;
case 4:
professor pro=new professor();
pro.getdetails();
pro.calsal();
pro.display("professor");
break;
default:
System.out.println("Invalid Input");
}
}
}
