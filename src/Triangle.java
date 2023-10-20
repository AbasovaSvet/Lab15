import java.util.Scanner;

public class Triangle  {
    Point a, b, c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Tреугольник{" +
                "\na " + a +
                ", \nb " + b +
                ", \nc " + c +
                "}\n\n";
    }
    //метод вычесление периметра возвращает числор дабл
}
