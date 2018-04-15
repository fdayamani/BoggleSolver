public class BoggleSolver {
    public BoggleSolver (String grid) {
        if (grid.length() != 16) {
            throw new RuntimeException("Your grid must contain 16 characters");
        }
    }
}
