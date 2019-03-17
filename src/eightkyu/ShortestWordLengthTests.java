package eightkyu;

import org.junit.Test;


import static junit.framework.TestCase.assertEquals;


public class ShortestWordLengthTests {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, ShortestWordLength.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWordLength.findShort("turns out random test cases are easier than writing out basic ones"));
    }
}