package pl.grzeslowski.project_euler_2;

import java.util.HashMap;
import java.util.Map;

public final class FibonacciGenerator {
    private final Map<Integer, Long> cache = new HashMap<Integer, Long>();

    public FibonacciGenerator() {
        cache.put(1, 1L);
        cache.put(2, 2L);
    }

    public long getFibonacciTerm(final int index) {
        if (index <= 0) {
            throw new IllegalArgumentException(
                    "Term index cannot be lower o equals 0!");
        }

        if (cache.containsKey(index)) {
            return cache.get(index);
        } else {
            long left=1;
            long right=1;
            
            for (int i = 2; i <= index; i++) {
                final long tmp = left + right;
                left=right;
                right = tmp;
            }
            
            cache.put(index, right);
            
            return right;
        }
    }
}
