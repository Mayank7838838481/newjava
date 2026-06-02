package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImp {
    static void main() {
        Set<Integer> set = new HashSet<>();
        set.add(21);
        set.add(23);
        set.add(43);
        set.add(65);
        set.add(76);
        set.add(12);
        System.out.println(set);
      //  int no=set.size();
       // System.out.println(no);
        System.out.println(set.size());
        System.out.println(set.contains(210));
        Set<Integer> set1=new HashSet<>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        System.out.println(set1);

        set.addAll(set1);
        System.out.println(set);
        System.out.println(set.size());

        Iterator<Integer> itr=set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }




    }
}
