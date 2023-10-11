import java.util.ArrayList;
import java.util.List;

public class WildCardExample1 {

    public static void display(List<?> list) {
        for (Object item : list
             ) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {


        ArrayList<String> listString = new ArrayList<String>();

        listString.add("A");
        listString.add("B");


        ArrayList<Integer> listInteger = new ArrayList<Integer>();

        listInteger.add(100);
        listInteger.add(200);

         //ArrayList<Object> list2 = listString; // Cannot convert String to Object


        ArrayList<? extends Object> list2 = listString;


       // list2 = listString;

        //list2 = listInteger;
        //list2.add(1,"a");//cannot use to an generics method call

        for (int i=0;i<list2.size();i++) {
            System.out.println(list2.get(i));
        }

        display(listString);
    }

}