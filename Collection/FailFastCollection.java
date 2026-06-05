package Collection;

import java.util.ArrayList;
import java.util.List;

public class FailFastCollection {
    static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(32);
        list.add(12);
        list.add(65);
        System.out.println(list);
        // Iterator
        for (Integer integer:list)
        {
            System.out.println(list);
          // adding a value
            list.add(32);
        }
    }
}
