package leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/path-crossing/
public class PathCrossing {

    public static boolean isPathCrossing(String path) {
        Set<String> isVisited = new HashSet<>();
        isVisited.add("0,0");
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
            }
            String currentPoint = x + "," + y;
            if (isVisited.contains(currentPoint)) return true;
            isVisited.add(currentPoint);
        }

        return false;
    }

    public static void main(String[] args) {
        String path1 = "NES";
        boolean output1 = isPathCrossing(path1); // false
        System.out.println("output1 = " + output1);

        String path2 = "NESWW";
        boolean output2 = isPathCrossing(path2); // true
        System.out.println("output2 = " + output2);
    }
}
