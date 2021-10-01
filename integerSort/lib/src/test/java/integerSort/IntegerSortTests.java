/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package integerSort;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerSortTests {
    @Test void sortTests() {
        assertEquals(Lists.newArrayList(), new IntegerSort().sort(Lists.newArrayList()));
        assertEquals(Lists.newArrayList(1), new IntegerSort().sort(Lists.newArrayList(1)));
        assertEquals(Lists.newArrayList(1, 2), new IntegerSort().sort(Lists.newArrayList(2, 1)));
        assertEquals(Lists.newArrayList(1, 2, 3), new IntegerSort().sort(Lists.newArrayList(2, 1, 3)));
        assertEquals(Lists.newArrayList(1, 2, 3), new IntegerSort().sort(Lists.newArrayList(2, 3, 1)));
    }
}
