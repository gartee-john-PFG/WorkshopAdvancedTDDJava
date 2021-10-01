/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package integerSort;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class IntegerSort {
    public List<Integer> sort(List<Integer> numbers) {
        List<Integer> sorted = new ArrayList<>();

        if(numbers.size() < 2 ){
            return numbers;
        }

        if(numbers.get(0) > numbers.get(1)){
            sorted.add(numbers.get(1));
            sorted.add(numbers.get(0));
        }

        return sorted;
    }
}
