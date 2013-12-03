package pl.grzeslowski.project_euler_2;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class FibonacciGeneratorTest {

    private final int in;
    private final long out;

    public FibonacciGeneratorTest(final int in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 1 }, { 2, 2 },
                { 3, 3 }, { 4, 5 }, { 8, 34 },
                { 10, 89 } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final FibonacciGenerator generator = new FibonacciGenerator();

        // when
        final long term = generator.getFibonacciTerm(in);

        // then
        Assertions.assertThat(term).isEqualTo(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_maxValue_equals_0() {
        // given
        final FibonacciGenerator generator = new FibonacciGenerator();

        // when
        generator.getFibonacciTerm(0);

        // then
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_maxValue_equals_minus_1() {
        // given
        final FibonacciGenerator generator = new FibonacciGenerator();

        // when
        generator.getFibonacciTerm(-1);

        // then
    }
}
