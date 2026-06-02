package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    static void main(String[] args) {
        //List Creation
       List<String> lst= new ArrayList<>();
       //add objects in the list
        lst.add("Ankit");
        lst.add("Mayank");
        lst.add("Rohit");
        lst.add("Nitin");
        lst.add("Ravi");
        System.out.println(lst);
        lst.size();
        System.out.println(lst.size());
        lst.add(1,"golu");
        System.out.println(lst);
        System.out.println(lst.contains("Mayank"));
        System.out.println(lst.isEmpty());
        System.out.println(lst.get(1));
        System.out.println(lst.removeFirst());
        System.out.println(lst.removeLast());

    }
}
