package com.kata6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOutlier {
    static int find(int[] integers) {
        Arrays.stream(integers).forEach(System.out::println);
        System.out.println("-");
        Map<Integer, List<Integer>> map = Arrays.stream(integers).mapToObj(e -> new Integer(e)).collect(Collectors.groupingBy(e -> Math.abs(e % 2)));
        List<Integer> list = map.get(0).size() == 1 ? map.get(0) : map.get(1);
        return list.size()>0?list.get(0):0;
    }
}
