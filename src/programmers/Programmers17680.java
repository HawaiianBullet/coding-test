package programmers;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/17680
public class Programmers17680 {

    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;
        List<String> cacheCities = new ArrayList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            if (cacheCities.remove(city)) {
                answer += 1;
            } else {
                answer += 5;
            }

            if (cacheCities.size() >= cacheSize) {
                cacheCities.remove(0);
            }
            cacheCities.add(city);

        }
        return answer;
    }

    public static void main(String[] args) {
//        int cacheSize = 3;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; // 50
//        int cacheSize = 3;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; // 21
//        int cacheSize = 2;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}; // 60
//        int cacheSize = 5;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}; // 52
//        int cacheSize = 2;
//        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"}; // 16
        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; // 25

        int solution = solution(cacheSize, cities);
        System.out.println("solution = " + solution);
    }
}
