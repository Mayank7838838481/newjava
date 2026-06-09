package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {
    static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("Dileep");
        set.add("Ankush");
        set.add("Navneet");
        set.add("Rohit");
        System.out.println(set);
        Set<String> set1=new HashSet<>();
        set1.add("32");
        set1.add("43");
        set1.add("54");
        set1.add("87");
        System.out.println(set1);
        set.addAll(set1);
        System.out.println(set);
        //Iterator
        Iterator<String> obj=set.iterator();
        while (obj.hasNext())
        {
            System.out.println(obj.next());
        }
    }
}
