package Collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCollection {
    static void main(String[] args) {
        List<Integer> lst=new CopyOnWriteArrayList<>();
        lst.add(21);
        lst.add(32);
        lst.add(54);
        lst.add(87);
        lst.add(78);
        for (Integer integer:lst)
        {
            System.out.println(lst);
            lst.add(98);
            lst.add(90);
        }
    }
}
