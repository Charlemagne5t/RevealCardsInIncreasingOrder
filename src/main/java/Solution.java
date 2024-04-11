import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] res = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(deck[n - 1]);

        for(int i = n - 2; i >= 0; i--){
            int last = deque.pollLast();
            deque.addFirst(last);
            deque.addFirst(deck[i]);
        }

        for (int i = 0; i < n; i++) {
            res[i] = deque.pollFirst();
        }

        return res;
    }
}
/**
 2, 3, 5, 7, 11, 13, 17

 */