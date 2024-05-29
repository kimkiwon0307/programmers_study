import java.util.*;

class Solution {
    public int[] solution(int n) {
       
        int count = (n + 1) / 2;
       
        int[] result = new int[count];
     
        for (int i = 0, num = 1; num <= n; i++, num += 2) {
            result[i] = num;
        }
        
        return result;
    }
}