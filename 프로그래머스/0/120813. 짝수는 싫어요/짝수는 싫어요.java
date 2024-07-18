import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        
        for(int i=1; i<=n; i+=2){
            count++;
            list.add(i);
        }
              
        int[] answer = new int[count];
        
        for (int i=0; i< count; i++){
            
            answer[i] = list.get(i);
            
        }
        
        return answer;
    }
}