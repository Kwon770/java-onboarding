package onboarding;

import java.util.Collections;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    private static List<Integer> convertToList(Integer integer) {
        List<Integer> list = Collections.emptyList();
        while (integer > 0) {
            list.add(integer % 10);
            integer /= 10;
        }

        return list;
    }

    private static int getMaxScore(List<Integer> scores) {
        return Integer.max(getNumberSumScore(scores.get(0).toString()), getNumberMultiplyScore(scores.get(1).toString()));
    }

    private static int getNumberSumScore(String number) {
    }

    private static int getNumberMultiplyScore(String number) {
        return 0;
    }
}