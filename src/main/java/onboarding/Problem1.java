package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    private static int getMaxScore(List<Integer> scores) {
        return Integer.max(getNumberSumScore(scores.get(0).toString()), getNumberMultiplyScore(scores.get(1).toString()));
    }

    private static int getNumberSumScore(String number) {
        return 0;
    }

    private static int getNumberMultiplyScore(String number) {
        return 0;
    }
}