import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BoggleSolverTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test public void
    returns_error_if_string_is_less_than_16_characters() {
        exception.expect(RuntimeException.class);
        exception.expectMessage("Your grid must contain 16 characters");

        new BoggleSolver("abcd");
    }


}
