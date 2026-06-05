package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddingTwoLists {
    static void main(String[] args) {
        List<String> lst=new java.util.ArrayList<>();
        lst.add("Mayank");
        lst.add("Kamal");
        lst.add("Aman");
        lst.add("Rohit");
        lst.add("Aryan");
        lst.add("Ansh");
        System.out.println(lst);
        List<String> lst2=new ArrayList<>();
        lst2.add("Rishbh");
        lst2.add("Sidhu");
        lst2.add("Radhika");
        System.out.println(lst2);
        lst.size();
        System.out.println(lst.size());
        System.out.println(lst.get(2));
//        lst.removeLast();
//        System.out.println(lst);
//        lst.removeFirst();
//        System.out.println(lst);
        lst.remove("Aman");
        System.out.println(lst);
        System.out.println(lst.hashCode());
        System.out.println(lst.contains("Ansh"));
        //Adding two lists
        lst.addAll(lst2);
        System.out.println(lst);
    }
    }

