package Collection;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class MapTreeMap {
    static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        System.out.println("Cars Details");
        map.put("Alto",400000);
        map.put("Swift",340000);
        map.put("Wagnor",230000);
        map.put("Thar",540000);
        System.out.println(map);
        map.get("Swift");
        System.out.println(map.get("Swift"));
        map.size();
        System.out.println(map.size());
        map.hashCode();
        System.out.println(map.hashCode());
        // Iterator
        map.forEach((Key, Value) ->
        {
            System.out.println(Key+" -> "+Value);
        });

    }
}
