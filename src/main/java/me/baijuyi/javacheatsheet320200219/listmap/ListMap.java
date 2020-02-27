package me.baijuyi.javacheatsheet320200219.listmap;

import java.util.*;

public class ListMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 10);

        Set<Integer> vals = new HashSet();

        for (String k : map.keySet()) {
            vals.add(map.get(k));
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if(vals.contains(it.next())) {
                it.remove();
            }
        }

        System.out.println(list);

    }
}
