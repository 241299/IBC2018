package day_4;

public class IntegerNumber implements Number, Comparable<IntegerNumber> {
    private int mValue;

    public IntegerNumber(int value) {
        this.mValue = value;
    }

    @Override
    public void printValue() {
        System.out.println(mValue);
    }

    @Override
    public int compareTo(IntegerNumber number) {
        return mValue - number.mValue;
    }
}
