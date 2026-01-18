package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {

    public static void main(String[] args) {
        // 숫자 사용 필터
        // 짝수만 거르기
        List<Integer> numberResult = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("evenPredicate = " + GenericFilter.filter(numberResult, n1 -> n1 % 2 == 0));

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        System.out.println("stringResult = " + GenericFilter.filter(strings, s -> s.length() >= 2));
    }
}
