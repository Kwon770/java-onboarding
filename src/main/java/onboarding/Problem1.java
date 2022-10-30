package onboarding;

import java.util.Collections;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    private static int getMaxPersonalScore(List<Integer> pageNumbers) {
        List<Integer> leftPageNumberLetters = convertToList(pageNumbers.get(0));
        List<Integer> rightPageNumberLetters = convertToList(pageNumbers.get(1));

        return Integer.max(getMaxPageScore(leftPageNumberLetters), getMaxPageScore(rightPageNumberLetters));
    }

    private static int getMaxPageScore(List<Integer> pageNumberLetters) {
        return Integer.max(getNumberSumScore(pageNumberLetters), getNumberMultiplyScore(pageNumberLetters));
    }

    private static List<Integer> convertToList(Integer integer) {
        List<Integer> list = Collections.emptyList();
        while (integer > 0) {
            list.add(integer % 10);
            integer /= 10;
        }

        return list;
    }

    private static int getNumberSumScore(List<Integer> letters) {
        return 0;
    }

    private static int getNumberMultiplyScore(List<Integer> letters) {
        return 0;
    }
}