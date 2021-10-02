/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package integerSort;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerSortTests {
    @Test void sortTests() {
        assertEquals(Lists.newArrayList(), new IntegerSort().sort(Lists.newArrayList()));
        assertEquals(Lists.newArrayList(1), new IntegerSort().sort(Lists.newArrayList(1)));
        assertEquals(Lists.newArrayList(1, 2), new IntegerSort().sort(Lists.newArrayList(2, 1)));
        assertEquals(Lists.newArrayList(1, 2, 3), new IntegerSort().sort(Lists.newArrayList(2, 1, 3)));
        assertEquals(Lists.newArrayList(1, 2, 3), new IntegerSort().sort(Lists.newArrayList(2, 3, 1)));
        assertEquals(Lists.newArrayList(1, 2, 3), new IntegerSort().sort(Lists.newArrayList(3, 1, 2)));
        assertEquals(Lists.newArrayList(1, 2, 3), new IntegerSort().sort(Lists.newArrayList(3, 2, 1)));
        assertEquals(Lists.newArrayList(1, 2, 2, 3), new IntegerSort().sort(Lists.newArrayList(2, 3, 2, 1)));

        List<Integer> unsorted = new ArrayList<>();

        for(int i = 0 ; i < 3000000 ; i++){
            unsorted.add((int)(Math.random() * 10000));
        }

        List<Integer> sorted = new IntegerSort().sort(unsorted);

        for(int i = 0 ; i < sorted.size()-1;i++)
            assertTrue(sorted.get(i) <= sorted.get(i+1));
    }
}
