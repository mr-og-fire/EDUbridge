class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display() { System.out.println("(" + x + ", " + y + ")"); }
}

public class PointDemo {
    public static void main(String[] args) {
        Point p = new Point(4, 7);
        p.display();
    }
}
