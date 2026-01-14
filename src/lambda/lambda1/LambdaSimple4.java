package lambda.lambda1;

// 실제로도 생략 가능한 부분은 최대한 적용해서 생략해서 사용하는 것이 좋음.
public class LambdaSimple4 {

    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2; // 기본
        MyCall call2 = (value) -> value * 2; // 타입 추론
        MyCall call3 = value -> value * 2; // 매개 변수가 하나 일 경우, 소괄호도 생략 가능

        System.out.println(call3.call(2));
    }

    interface MyCall {
        int call(int value);
    }
}
