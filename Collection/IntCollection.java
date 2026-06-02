package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntCollection {
    static void main(String[] args) {
        List<Integer> lst1= new ArrayList<>();
        lst1.add(23);
        lst1.add(43);
        lst1.add(41);
        lst1.add(65);
        lst1.add(98);
        lst1.add(90);
        lst1.add(77);
        List<Integer> lst2= new ArrayList<>();
        lst2.add(263);
        lst2.add(437);
        lst2.add(416);
        lst2.add(655);
        lst2.add(989);
        lst2.add(905);
        System.out.println(lst1);
        System.out.println(lst2);
        Collections.sort(lst1);
        System.out.println(lst1);
        //Remove
        lst1.remove(2);
        System.out.println(lst1);
      //  lst1.clear();
//        System.out.println(lst1);
          lst1.hashCode();
        System.out.println(lst1.hashCode());
       lst1.size();
        System.out.println(lst1.size());
        lst1.addAll(lst2);
        System.out.println(lst1);
        lst1.set(3,5);
        System.out.println(lst1);
        System.out.println(lst1.get(3));

    }
}
