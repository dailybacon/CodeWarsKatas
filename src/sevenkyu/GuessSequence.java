package sevenkyu;

import java.util.stream.IntStream;

public class GuessSequence {

    static int[] sequence(int x) {
        return IntStream
                .range(1, x + 1)
                .mapToObj(i -> ((Integer) i).toString())
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

