package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV2 {

    private List<Integer> internalList;

    // 기본 생성자를 외부에서 직접 사용하지 못 하도록 접근제어자를 private로 수정
    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    // static factory(정적 팩토리 메서드): 객체 생성을 담당하는 static 메서드
    // 생성자 대신 of() 메서드를 이용하여 인스턴스를 생성하고 반환하는 역할을 함.
    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer element : internalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return new MyStreamV2(filtered);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : internalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV2(mapped);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
