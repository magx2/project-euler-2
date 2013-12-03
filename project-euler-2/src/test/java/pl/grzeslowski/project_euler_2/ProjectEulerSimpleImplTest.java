package pl.grzeslowski.project_euler_2;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ProjectEulerSimpleImplTest {
    private final int in;
    private final long out;

    public ProjectEulerSimpleImplTest(final int in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 0 },
                { 2, 0 }, { 3, 2 }, { 13, 10 }, { 89, 2 + 8 + 34 } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final ProjectEulerSimpleImpl euler = new ProjectEulerSimpleImpl();

        // when
        final long term = euler.findSum(in);

        // then
        Assertions.assertThat(term).isEqualTo(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_maxValue_equals_0() {
        // given
        final ProjectEulerSimpleImpl euler = new ProjectEulerSimpleImpl();

        // when
        euler.findSum(0);

        // then
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_maxValue_equals_minus_1() {
        // given
        final ProjectEulerSimpleImpl euler = new ProjectEulerSimpleImpl();

        // when
        euler.findSum(-1);

        // then
    }
}
