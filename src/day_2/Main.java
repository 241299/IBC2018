package day_2;

public class Main {
    public static void main(String[] args) {
        solveAndPrint(1,2,3);

        points();
    }

    static void solveAndPrint(double a, double b, double c) {

    }

    static boolean isSolvable(double a, double b, double c) {
        return a != 0 && getDiscriminant(a, b, c) >= 0;
    }

    static double getDiscriminant(double a, double b, double c) {
        return 0;
    }

    static void points() {
        Point p1 = new Point(7, 9);
        Point p2 = new Point(17, 19);
        Point base = new Point();

        System.out.println(Point.distanceBetween(p1, base));
        System.out.println(p1.distanceTo(base));

        System.out.println(Point.counter);
    }
}