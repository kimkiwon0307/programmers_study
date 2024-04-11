class Solution {
    public int solution(int num1, int num2) {
     
         double num01 = num1 * 1.0;
        double num02 = num2 * 1.0;

        double a = (num01 / num02) * 1000;


        System.out.println("a = " + (int)a);
        
        
        
        return (int)a;
    }
}