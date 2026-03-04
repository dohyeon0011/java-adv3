package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// Generic 타입 추가
public class MyStreamV3<T> {

    private List<T> internalList;

    // 기본 생성자를 외부에서 직접 사용하지 못 하도록 접근제어자를 private로 수정
    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    // static factory(정적 팩토리 메서드): 객체 생성을 담당하는 static 메서드
    // 생성자 대신 of() 메서드를 이용하여 인스턴스를 생성하고 반환하는 역할을 함.
    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T element : internalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (T element : internalList) {
            mapped.add(mapper.apply(element));
        }
        return MyStreamV3.of(mapped);
    }

    public List<T> toList() {
        return internalList;
    }
}
