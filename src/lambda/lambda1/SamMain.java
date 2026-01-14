package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };
        samInterface.run();

        // 컴파일 오류
        // 함수형 인터페이스가 아니어서 불가능(어떤 메서드에 담겨서 선언되어야 할 지 몰라서)
        /*
        NotSamInterface notSamInterface = () -> {
            System.out.println("notSam");
        };
        notSamInterface.run();
        NotSamInterface.go();
        */
    }
}
