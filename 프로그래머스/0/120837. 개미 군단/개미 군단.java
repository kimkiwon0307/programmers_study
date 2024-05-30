class Solution {
    public int solution(int hp) {
        int answer = 0;
        int lastHp = 0;
        int Kant = 0;
        int Bant = 0;
        int ant = 0;
        
        
        Kant = hp / 5;
        hp = hp %  5;
        
        Bant = hp / 3;
        hp = hp % 3;
        
        ant = hp;
                
        answer = Kant + Bant + ant;
        
        return answer;
    }
}