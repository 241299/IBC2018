package day_4;

public class FloatingNumber implements Number, Comparable<FloatingNumber> {
    private double mValue;

    public FloatingNumber(double mValue) {
        this.mValue = mValue;
    }

    @Override
    public void printValue() {
        System.out.printf("%.2f", mValue);
    }

    @Override
    public int compareTo(FloatingNumber number) {
        return (int) (mValue - number.mValue);
    }
}
