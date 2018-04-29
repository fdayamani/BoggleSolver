import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WordFinderTest {

    private WordFinder wordFinder;

    @Before public void setUp() {
        Map<GridPosition, Character> grid = new HashMap<>();
        grid.put(new GridPosition(1, 1), 'A');
        grid.put(new GridPosition(1, 2), 'B');
        grid.put(new GridPosition(2, 1), 'E');
        grid.put(new GridPosition(2, 2), 'F');
        wordFinder = new WordFinder(grid);
    }

    @Ignore
    @Test public void
    finds_all_three_letter_words() {
        List<String> threeLetterWords = wordFinder.findWordsOfLength(3);

        assertThat(threeLetterWords, equalTo(asList(
                "ABF", "ABE", "AEB", "AEF", "AFB", "AFE",
                "BAE", "BAF", "BEA", "BEF", "BFA", "BFE",
                "EAB", "EAF", "EBA", "EBF", "EFA", "EFB",
                "FAB", "FAE", "FBA", "FBE", "FEA", "FEB"
        )));
    }
}
