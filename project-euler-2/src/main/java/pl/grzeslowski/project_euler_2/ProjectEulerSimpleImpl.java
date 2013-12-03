package pl.grzeslowski.project_euler_2;

public final class ProjectEulerSimpleImpl implements ProjectEuler2 {

    @Override
    public long findSum(final long fibonacciMaxElement) {
        if (fibonacciMaxElement <= 0) {
            throw new IllegalArgumentException(
                    "FibonacciMaxElement cannot be smaller or equal 0!");
        }

        final FibonacciGenerator generator = new FibonacciGenerator();

        long sum = 0L;
        long tmp = generator.getFibonacciTerm(2);
        for (int i = 2; tmp < fibonacciMaxElement; i += 3) {
            sum += tmp;

            tmp = generator.getFibonacciTerm(i + 3);
        }

        return sum;
    }

}
