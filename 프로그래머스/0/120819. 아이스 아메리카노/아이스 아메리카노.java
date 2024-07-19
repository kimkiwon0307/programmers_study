class Solution {
    public int[] solution(int money) {
      
        int americano = money / 5500;
        int nammoney = money -(americano * 5500);
        
        
        int[] answer = new int[] {americano, nammoney};
        return answer;
    }
}