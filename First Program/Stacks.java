import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();

        boolean result = stk.isEmpty();
        System.out.println("Is the Stack Empty: " + result);

        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);

        System.out.println("Elements in Stack" + stk);
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Popped element:" + stk.pop());
        System.out.println("Popped element:" + stk.pop());
        //Displaying the size of Stack
        System.out.println("Thesizeis:"+stk.size());
        //Printing elements one by one
        for(int i=0; i<stk.size (); i++){
            System.out.print(stk.get (i) + " ");
        }
        
        System.out.println();
    }
}
