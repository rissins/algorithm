package codechallenge;



//https://programmers.co.kr/learn/courses/30/lessons/12903
public class Solution24 {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 != 0) {
            answer = String.valueOf(s.charAt(s.length() / 2));
        } else {
            answer = String.valueOf(s.charAt((s.length() / 2)-1))+s.charAt(s.length() / 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution24 solution23 = new Solution24();
        String s = "qwer";
        solution23.solution(s);

    }
}
