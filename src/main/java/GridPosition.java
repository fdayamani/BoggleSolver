public class GridPosition {
    public final int xPosition;
    public final int yPosition;

    public GridPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public boolean connectsTo(GridPosition gridPosition) {
        return connectsHorizontallyVerticallyOrDiagonally(gridPosition) && !theSame(gridPosition);
    }

    private boolean connectsHorizontallyVerticallyOrDiagonally(GridPosition gridPosition) {
        return Math.abs(gridPosition.xPosition - xPosition) < 2 && Math.abs(gridPosition.yPosition - yPosition) < 2;
    }

    private boolean theSame(GridPosition gridPosition) {
        return gridPosition.equals(this);
    }

    @Override
    public String toString() {
        return "GridPosition{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GridPosition that = (GridPosition) o;

        if (xPosition != that.xPosition) return false;
        return yPosition == that.yPosition;

    }

    @Override
    public int hashCode() {
        int result = xPosition;
        result = 31 * result + yPosition;
        return result;
    }
}
