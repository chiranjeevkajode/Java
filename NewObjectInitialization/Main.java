package NewObjectInitialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Banker mohan = new Banker("Mohan", 34562.23);
        
        // Banker ranjit;
        // ranjit = mohan;
        // ranjit.setcustomerBalance(324.3);

        //Array List Example
        ArrayList<Integer> newLinkList = new ArrayList<>();
        newLinkList.add(5);
        newLinkList.add(6);
        newLinkList.add(7);
        newLinkList.add(8);

        for (int i = 0; i < newLinkList.size(); i++) {
            System.out.println(i + " --- " + newLinkList.get(i));
        }
        newLinkList.add(1,3);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (int i = 0; i < newLinkList.size(); i++) {
            System.out.println(i + " --- " + newLinkList.get(i));
        }


        //Linked List Example

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Action");
        linkedList.add("Comedy");
        linkedList.add("Drama");

        // Iterators

        pLinkedlist(linkedList);
            System.out.println("xxxxxxxxxxxxxxxxxxx--");
        linkedList.add(1, "Iron man");
        pLinkedlist(linkedList);

    }

    public static void pLinkedlist (LinkedList<String>linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Your Movei Type "  +  i.next());
        }
    }
}
