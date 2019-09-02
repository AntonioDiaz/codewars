package com.kata6;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (map.get(i)==null) {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }
        return map.keySet().stream().filter(e -> map.get(e) % 2 == 1).findFirst().orElse(0);
    }

}
