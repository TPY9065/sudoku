package tse.lawrence.sudoku.enums;

public enum Difficulty
{
    EASY(37),
    NORMAL(27),
    HARD(17);

    public final int MIN_REQUIRED_NUMBERS;
    public final int MAX_REMOVED_NUMBERS;

    private Difficulty(int count)
    {
        MIN_REQUIRED_NUMBERS = count;
        MAX_REMOVED_NUMBERS = 81 - count;
    }
}
