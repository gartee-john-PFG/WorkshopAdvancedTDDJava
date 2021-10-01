/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package integerSort;

import java.util.ArrayList;
import java.util.List;

public class IntegerSort {
    public List<Integer> sort(List<Integer> numbers) {
        List<Integer> sorted = new ArrayList<>();

        if (numbers.size() == 0) {
            return numbers;
        } else {
            List<Integer> l = new ArrayList<>();
            Integer m = numbers.get(0);
            List<Integer> h = new ArrayList<>();

            for (Integer i : numbers.subList(1,numbers.size())) {
                if (m > i)
                    l.add(i);
                else
                    h.add(i);
            }

            sorted.addAll(sort(l));
            sorted.add(m);
            sorted.addAll(sort(h));
        }

        return sorted;
    }
}
