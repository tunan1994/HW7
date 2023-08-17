import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> findSimpleNumber = findSimpleNumber(100);
        for (Integer integer : findSimpleNumber) {
            System.out.println(integer);
        }

    }

    public static List<Integer> findAvialable(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumber(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i%j == 0){
                    simple = false;
                }
            }
            if (simple){
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }
}