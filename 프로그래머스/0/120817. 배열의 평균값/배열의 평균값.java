import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        double answer = 0;
        
        for(int number : numbers){
            sum += number;
        }  
        
            answer = (double)sum / numbers.length ;
      
        
        return  answer;
    }
}