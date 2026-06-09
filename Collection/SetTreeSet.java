package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {
    static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(32);
        set.add(54);
        set.add(76);
        set.add(65);
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
