package Collection;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedList {
    static void main(String[] args) {
    Map<String,Integer> map=new LinkedHashMap<>();
    map.put("Swift",450000);
    map.put("Alto",400000);
    map.put("triger",560000);
    map.put("k10",3000000);
    map.put("thar",750000);
        System.out.println(map);
        map.size();
        System.out.println(map.size());
        map.get("Alto");
        System.out.println(map.get("Alto"));
        // iteration using lamda(->)
        map.forEach((Key,Value)->
        {
            System.out.println(Key+"->"+Value);

        });
        // iterate only key
        map.keySet();
        {
            System.out.println(map.keySet());
        }
        // iterate only Values
        map.values();
        System.out.println(map.values());
        // iterate using J2EE
        for(Map.Entry<String, Integer> obj:map.entrySet())
        {
            System.out.println(obj.getKey()+" = "+obj.getValue());
        }


    }
}
