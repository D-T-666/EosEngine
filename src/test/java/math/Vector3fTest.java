package math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector3fTest {
    Vector3f v1;
    Vector3f v2;
    Vector3f v3;

    @BeforeEach
    void init() {
        v1 = new Vector3f(2, 2, 2);
        v2 = new Vector3f(7, 3, 9);
        v3 = new Vector3f(2, 2, 1);
    }


    @Test
    void testStaticAdd() {
        Vector3f additionTestVector = new Vector3f(9, 5, 11);
        assertEquals(additionTestVector, Vector3f.add(v1, v2));
    }

    @Test
    void testStaticSub() {
        Vector3f subtractionTestVector = new Vector3f(5, 1, 7);
        assertEquals(subtractionTestVector, Vector3f.sub(v2, v1));
    }

    @Test
    void testLength() {
        float correctLength = 3;
        assertEquals(correctLength, v3.length());
    }
}
