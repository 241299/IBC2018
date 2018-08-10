package day_4;

import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {
        Number number = new IntegerNumber(666);
        number.printValue();

        number = new FloatingNumber((double) 2/3);
        number.printValue();

        IntegerNumber[] numbers = new IntegerNumber[3];
        numbers[0] = new IntegerNumber(7);
        numbers[1] = new IntegerNumber(100);
        numbers[2] = new IntegerNumber(-25);

        Arrays.sort(numbers);

        numbers[0].printValue();
        numbers[1].printValue();
        numbers[2].printValue();
    }
}
