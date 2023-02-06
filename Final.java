package org.example;
import java.util.HashMap;
import java.util.Iterator;
public final class Final {
    private final int id;

    private final String name;

    private final HashMap testMap;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public HashMap getTestMap() {
        return (HashMap) testMap.clone();
    }

    public Final(int id, String name, HashMap map){
        this.id = id;
        this.name = name;
        HashMap tempMap = new HashMap();
        String key;
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            key = (String) it.next();
            tempMap.put(key, map.get(key));
        }
        this.testMap=tempMap;
    }

}
