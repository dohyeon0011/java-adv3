package lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        // 람다 직접 대입: 문제 없음
        FunctionA functionA = i -> "value = " + i;
        FunctionA functionB = i -> "value = " + i;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입: 불가능(자바 타입 시스템 상 전혀 다른 인터페이스 타입이기 때문, 함수형 인터페이스 인스턴스를 선언하자마자 타입이 명시가 됨.)
        // 한번 이미 대입된 변수(FunctionA)는 엄연히 FunctionA 타입의 객체가 되었으므로, 이를 FunctionB 참조 변수에 그대로 대입할 수 없음.
        // 시그니처가 똑같은 함수형 인터페이스라도, 타입이 다르면 상호 대입이 되지 않는 것이 자바의 타입 시스템 규칙.
//        functionB targetB = functionA; // 컴파일 에러
    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
