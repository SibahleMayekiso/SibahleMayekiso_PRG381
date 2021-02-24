import java.util.*;

public class Collections {
    public static void main(String[] args) {
       List<String> arrLst = new ArrayList<String>();

       arrLst.add("Simba");
       arrLst.add("Anila");
       arrLst.add("Lawrence");
       arrLst.add("Themba");

       //Output as an object
       System.out.println("----------------------AS object--------------------------");
       System.out.println(arrLst);

       //Output using Iterator
       /*
       Iterator itr = arrLst.iterator();
       System.out.println("AS single item");
       while (itr.hasNext()) {
           System.out.println(itr.next());
       }
       */

       //Outputs using for-each
       /*
       for (String obj : arrLst) {
        System.out.println(obj);
        }
        */

        //Output using lambda expression
        /*
        arrLst.forEach(a -> {
            System.out.println(a);
        });
        */

        //Removal of item in List using index
        arrLst.remove(2);

        //arrLst.remove("Themba"); //Remove using object

        System.out.println();
        System.out.println("---------------------------------------------------------");
        for (String obj : arrLst) {
            System.out.println(obj);
            }

    }
}
