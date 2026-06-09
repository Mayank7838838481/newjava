package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetHahCode {
    static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(12);
        set.add(32);
        set.add(43);
        set.add(54);
        set.add(67);
        set.add(87);
        System.out.println(set);
        set.size();
        System.out.println(set.size());
        set.isEmpty();
        System.out.println(set.isEmpty());
        set.contains(43);
        System.out.println(set.contains(43));
        set.remove(67);
        System.out.println(set);
        System.out.println(set.hashCode());
        Iterator<Integer> obj= set.iterator();
        while (obj.hasNext())
        {
            System.out.println(obj.next());
        }
    }
}
