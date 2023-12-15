package leetcode;

import java.util.*;

// https://leetcode.com/problems/destination-city/
public class DestinationCity {

    // 목적지가 정확히 1개라서 출발지 배열에 포함되지 않는 목적지가 최종 목적지
    public static String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }
        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths1 = new ArrayList<>();
        paths1.add(Arrays.asList("London", "New York"));
        paths1.add(Arrays.asList("New York", "Lima"));
        paths1.add(Arrays.asList("Lima", "Sao Paulo"));
        String output1 = destCity(paths1); // "Sao Paulo"
        System.out.println("output1 = " + output1);

        List<List<String>> paths2 = new ArrayList<>();
        paths2.add(Arrays.asList("B", "C"));
        paths2.add(Arrays.asList("D", "B"));
        paths2.add(Arrays.asList("C", "A"));
        String output2 = destCity(paths2); // "A"
        System.out.println("output2 = " + output2);

        List<List<String>> paths3 = new ArrayList<>();
        paths3.add(Arrays.asList("A", "Z"));
        String output3 = destCity(paths3); // "Z"
        System.out.println("output3 = " + output3);
    }
}
