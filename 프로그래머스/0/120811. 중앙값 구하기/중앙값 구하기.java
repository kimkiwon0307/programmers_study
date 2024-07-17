import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        
        Arrays.sort(array);
        
        int a = array.length;
        
        int num = a/2;
        
        int answer = array[num];
        return answer;
    }
}