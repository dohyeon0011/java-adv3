package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV3 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        Function<String, Integer> toNumber = s -> Integer.valueOf(s);
        System.out.println("numbers = " + map(list, toNumber));

        // 문자열의 길이
        Function<String, Integer> toLength = s -> s.length();
        System.out.println("lengths = " + map(list, toLength));
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }
}