package org.example;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap h1 = new HashMap();
        h1.put("1", "first");
        h1.put("2", "second");
        String s = "original";
        int i=10;

        Final fin = new Final(i,s,h1);
        System.out.println("id:"+fin.getId());
        System.out.println("name:"+fin.getName());
        System.out.println("testMap:"+fin.getTestMap());

        HashMap map = fin.getTestMap();
        map.put("3", "third");

        System.out.println("new testMap:"+fin.getTestMap());


    }
}