import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        
        if (arr.length > 0) {
            result.add(arr[0]);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}