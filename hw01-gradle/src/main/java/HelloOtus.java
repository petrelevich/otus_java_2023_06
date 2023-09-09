import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S106")
public class HelloOtus {
    public static void main(String... args) {
        List<Integer> oddList = new ArrayList<>();
        int min = 0;
        int max = 100;
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                oddList.add(i);
            }
        }
        Lists.reverse(oddList);
        System.out.println(oddList);
    }
}
