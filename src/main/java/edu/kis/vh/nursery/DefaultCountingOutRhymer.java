package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public final int FULL = 11;
    public final int EMPTY = -1;
    public final int SIZE = 12;
    private final int[] numbers = new int[SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
