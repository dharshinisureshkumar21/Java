import java.util.ArrayList;
class cities
{
    public static void main(String[]a)
    {
        ArrayList<String>list1=new ArrayList<>();
        list1.add("Chennai");
        list1.add("Coimbatore");
        list1.add("Madurai");
        System.out.println("Array List:"+list1);
        String city="Banglore";
        list1.add(city);
        System.out.println("City to add:"+city);
        System.out.println("Updated List:"+list1);
        System.out.println("----------------------------");
        ArrayList<String>list2=new ArrayList<>();
        list2.add("Chennai");
        list2.add("Madurai");
        list2.add("Trichy");
        System.out.println("Array List:"+list2);
        int index=1;
        String city2="Salem";
        list2.add(index,city2);
        System.out.println("Index:"+index);
        System.out.println("City to Add:"+city2);
        System.out.println("Updated List:"+list2);
        System.out.println("----------------------------");
        ArrayList<String>list3=new ArrayList<>();
        list3.add("Chennai");
        list3.add("Madurai");
        list3.add("Trichy");
        list3.add("Coimbatore");
        System.out.println("Initial List:"+list3);
        System.out.println("City to Check: Madurai");
        if(list3.contains("Madurai"))
        System.out.println("City Found");
        else
        System.out.println("City Not Found");
        System.out.println("----------------------------");
        ArrayList<String>list4=new ArrayList<>();
        list4.add("Chennai");
        list4.add("Coimbatore");
        list4.add("Madurai");
        list4.add("Cuddalore");
        System.out.println("Initial List"+list4);
        System.out.println("Starting Letter: C");
        char letter='C';
        System.out.print("Cities Starting with'"+letter+"': [");
        boolean first=true;
        for (String city3:list4) 
        {
            if (city3.startsWith(String.valueOf(letter))) 
            {
                if (!first) 
                {
                    System.out.print(",");
                }
                System.out.print(city3);
                first=false;
            }
        }
        System.out.println("]");

    }
}
