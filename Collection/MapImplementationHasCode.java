package Collection;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapImplementationHasCode {
    static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("Name","Harish");
        map.put("Age","21");
        map.put("Adress H.no","34");
        map.put("Mob no.", "910000000");
        map.put("sallary","23000");
        System.out.println(map);
         map.size();
        System.out.println(map.size());
        map.get("Name");
        System.out.println(map.get("Name"));
    map.isEmpty();
        System.out.println(map.isEmpty());
        map.values();
        System.out.println(map.values());
        map.keySet();
        System.out.println(map.keySet());
        map.hashCode();
        System.out.println(map.hashCode());
        map.containsKey("Age");
        System.out.println(map.containsKey("Age"));
        System.out.println(map.remove("Age"));
        System.out.println(map);
        // Iterator
        map.forEach((Key,Value)->
        {
            System.out.println(Key+"->"+Value);

        });



    }
}
