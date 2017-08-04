import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class Exam1Test {
    Exam1 exam01 = new Exam1();

    @Test
    public void n_is_8() {
        long a = 8;
        long output = exam01.solution(a);
        assertEquals(8, output);
    }

    @Test
    public void n_is_10() {
        long a = 10;
        long output = exam01.solution(a);
        assertEquals(9, output);
    }

    @Test
    public void n_is_20() {
        long a = 20;
        long output = exam01.solution(a);
        assertEquals(19, output);
    }

    @Test
    public void n_is_132() {
        long a = 132;
        long output = exam01.solution(a);
        assertEquals(129, output);
    }

    @Test
    public void n_is_111111111111111110() {
        long a = 111111111111111110L;
        long output = exam01.solution(a);
        assertEquals(99999999999999999L, output);
    }

    @Test
    public void n_is_989999999999999999() {
        long a = 989999999999999999L;
        long output = exam01.solution(a);
        assertEquals(899999999999999999L, output);
    }

    @Test
    public void n_is_653161544328834085L() {
        long a = 653161544328834085L;
        long output = exam01.solution(a);
        assertEquals(599999999999999999L, output);
    }


}