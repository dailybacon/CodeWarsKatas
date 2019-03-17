package sixkyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LikesStringTests {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", LikesString.whoLikesIt());
        assertEquals("Peter likes this", LikesString.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", LikesString.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", LikesString.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", LikesString.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}