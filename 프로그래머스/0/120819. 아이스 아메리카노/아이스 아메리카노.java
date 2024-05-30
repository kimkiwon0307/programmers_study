class Solution {
    public int[] solution(int money) {
        int jan = 0;
        int janMoney = 0;
        jan = money / 5500;
        janMoney = money % 5500;
        
        int[] answer = new int[2];
        
        answer[0] = jan;
        answer[1] = janMoney;
        
        
        return answer;
    }
}