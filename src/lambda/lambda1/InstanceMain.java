package lambda.lambda1;

import lambda.Procedure;

public class InstanceMain {

    /**
     * 익명 클래스의 경우 `$` 로 구분하고 뒤에 숫자가 붙는다.(1, 2, 3, ...)
     * 람다의 경우 `$$`로 구분하고 뒤에 복잡한 문자가 붙는다.
     * 실행 환경에 따라 결과는 다를 수 있다.
     */
    public static void main(String[] args) {
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };
        System.out.println("class.class = " + procedure1.getClass());
        System.out.println("class.instance = " + procedure1);

        Procedure procedure2 = () -> {
            System.out.println("hello! lambda");
        };
        System.out.println("lambda.class = " + procedure2.getClass());
        System.out.println("lambda.instance = " + procedure2);
    }
}
