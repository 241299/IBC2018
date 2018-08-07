package day_2;

public class Point {
	// Variable to count the number of points
    static int counter;
	
	// Attributes which define a point
    int x, y;
	
	// Constructor for creating a point
	Point(int x, int y) {
        this.x = x;
        this.y = y;

		// Increase the amount of points we have
        counter++;
    }

	// Default constructor. We assume the base point to be (0, 0)
    Point() {
        this(0, 0);
    }

	// Object's method to calculate distance to another point
    double distanceTo(Point otherPoint) {
        return Math.sqrt(
                Math.pow(x - otherPoint.x, 2) + Math.pow(y - otherPoint.y, 2)
        );
    }

	// Class's method to calculate distance between two points
    static double distanceBetween (Point p1, Point p2) {
        return p1.distanceTo(p2);
    }
}
