public class Point {
    double x, y;
    public Point(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }
//https://www.cyberforum.ru/java-beginners/thread2569120.html?ysclid=lnyda87hld793473214
    public double distance(Point p2){
        return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
//

    @Override
    public String toString() {
        return "Точки   " +
                "(x " + x +
                ", y " + y+")";
    }

}
