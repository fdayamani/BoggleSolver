import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GridPositionTest {

    @Test public void
    correctly_figures_out_whether_another_position_connects_to_it() {
        GridPosition gridPosition = new GridPosition(2, 2);

        assertThat(gridPosition.connectsTo(new GridPosition(1, 1)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(1, 2)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(1, 3)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(1, 4)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(2, 1)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(2, 2)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(2, 3)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(2, 4)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(3, 1)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(3, 2)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(3, 3)), equalTo(true));
        assertThat(gridPosition.connectsTo(new GridPosition(3, 4)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(4, 1)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(4, 2)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(4, 3)), equalTo(false));
        assertThat(gridPosition.connectsTo(new GridPosition(4, 4)), equalTo(false));
    }

}