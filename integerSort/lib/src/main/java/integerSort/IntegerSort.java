/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package integerSort;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class IntegerSort {
    static public List<Integer> sort(List<Integer> numbers) {
        List<Integer> sorted = new ArrayList<Integer>();
        List<Integer> low = new ArrayList<Integer>();
        Integer middle = null;
        List<Integer> high = new ArrayList<Integer>();

        if(numbers.size() > 0) {
            middle = numbers.get(0);

            for (int i : numbers.subList(1, numbers.size())) {
                if (i < middle)
                    low.add(i);
                else
                    high.add(i);
            }
        }

        if(low.size() > 0) sorted.addAll(sort(low));
        if(middle != null) sorted.add(middle);
        if(high.size() > 0) sorted.addAll(sort(high));

        return sorted;
    }
}
