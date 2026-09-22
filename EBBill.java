import java.util.Scanner;
class Eb
{
      public static void main(String[] a)
      {
            Scanner ebill=new Scanner(System.in);
            double fee=0;
            System.out.print("Enter Consumer Name:");
            String name=ebill.nextLine();
            System.out.print("Enter Consumer Number:");
            int no=ebill.nextInt();
            System.out.print("Enter Number of Units Consumed:");
            int unit=ebill.nextInt();
            ebill.nextLine();
            System.out.print("Enter Connection Type:(1.Domestic2.Commercial)");
            String connType=ebill.nextLine();
            if(connType.equals("Domestic"))
            {
                  if(unit<=100)
                        fee=0;
                  else if(unit<=200)
                        fee=(100*0)+((unit-100)*2);
                  else if(unit<=500)
                        fee=(100*0)+(100*2)+(unit-200)*4;
                  else
                        fee=(100*0)+(100*2)+(200*4)+((unit-400)*6);
            }
            else if(connType.equals("Commercial"))
            {
                  if(unit<=100)
                      fee=100*2;
                  else if(unit<=200)
                        fee=(100*2)+((unit-100)*4);
                  else if(unit<500)
                        fee=(100*2)+(100*4)+((unit-200)*6);
                  else
                        fee=(100*2)+(100*4)+(200*6)+((unit-400)*7);
            }
            System.out.println("Consumer Name:"+name);
            System.out.println("Consumer Number:"+no);
            System.out.println("Consumed Units:"+unit);
            System.out.println("Connection:"+connType);
            System.out.println("Amount Rs:" +fee);
      }

}
