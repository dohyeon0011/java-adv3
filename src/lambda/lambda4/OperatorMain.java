package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {

    public static void main(String[] args) {
        // UnaryOperator: 입력과 출력 타입이 동일한 "단항 연산" 수행을 의미
        Function<Integer, Integer> square1 = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;
        System.out.println("square1 = " + square1.apply(5));
        System.out.println("square2 = " + square2.apply(5));

        // BinaryOperator: 같은 타입 2개를 입력 받아, 같은 타입을 결과로 반환하는 "이항 연산" 수행을 의미
        BiFunction<Integer, Integer, Integer> addition1 = (x, y) -> x + y;
        BinaryOperator<Integer> addition2 = (x, y) -> x + y;

        System.out.println("addition1.apply(1, 2) = " + addition1.apply(1, 2));
        System.out.println("addition2.apply(1, 2) = " + addition2.apply(1, 2));
    }
}
