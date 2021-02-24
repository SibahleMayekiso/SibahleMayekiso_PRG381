import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        //Vector
        int n = 5;

        List<Integer> vctr = new Vector<Integer>(n);

        for (int i = 1; i <= n; i++) {
            vctr.add(i);
        }

        System.out.println(vctr);
        System.out.println();
        System.out.println("----------------------------------------------------------");

        vctr.remove(3);

        //Display as List object
        System.out.println();
        System.out.println("Display as List");
        System.out.println(vctr);

        //Display by iteration
        System.out.println();
        System.out.println("Display by iteration");
        for (int i = 0; i < vctr.size(); i++) {
            System.out.println(vctr.get(i) + " ");
        }
    }
}
