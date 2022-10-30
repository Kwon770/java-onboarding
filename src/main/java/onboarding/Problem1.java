package onboarding;

import java.util.Collections;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        try {
            int pobiScore = getPersonalScore(pobi);
            int crongScore = getPersonalScore(crong);

            if (pobiScore > crongScore) {
                answer = 1;
            } else if (pobiScore < crongScore) {
                answer = 2;
            } else {
                answer = 0;
            }
        } catch (Exception e) {
            answer = -1;
        }

        return answer;
    }

    private static int getPersonalScore(List<Integer> pageNumbers) {
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
        int score = 0;
        for (Integer letter : letters) {
            score += letter;
        }

        return score;
    }

    private static int getNumberMultiplyScore(List<Integer> letters) {
        int score = 1;
        for (Integer letter : letters) {
            score *= letter;
        }

        return score;
    }
}