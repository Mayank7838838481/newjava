package Collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    static void main(String[] args) {
        List<String> lst=new java.util.ArrayList<>();
        lst.add("Mayank");
        lst.add("Kamal");
        lst.add("Aman");
        lst.add("Rohit");
        lst.add("Aryan");
        lst.add("Ansh");
        System.out.println(lst);
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
        //Iterator
        Iterator<String>obj=lst.iterator();
        while (obj.hasNext())
        {
            System.out.println(obj.next());
        }
    }
}
