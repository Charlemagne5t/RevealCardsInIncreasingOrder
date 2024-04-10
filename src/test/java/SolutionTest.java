import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        int[] expected = {2, 13, 3, 11, 5, 17, 7};
        int[] actual = new Solution().deckRevealedIncreasing(deck);

        Assert.assertArrayEquals(expected, actual);
    }
}
