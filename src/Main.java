import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Triangle> triangle = inputTriangleList(2);
        System.out.println(triangle);
    }
    private static ArrayList<Triangle> inputTriangleList(int size){
        System.out.println("Введите "+size+" треугольников:");

        ArrayList<Triangle> triangles = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Triangle t = inputTriangle();
            triangles.add(t);
        } return triangles;
    }

    public static Triangle inputTriangle(){
        System.out.println("Вводите треугольник");
        Point p1 = inputPoint(1);
        Point p2 = inputPoint(2);
        Point p3 = inputPoint(3);
        return new Triangle(p1, p2, p3);
    }

    public  static  Point inputPoint(int i){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты "+i+" стороны:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        Point p1 = new Point(x1,y1);
        return p1;
    }
    public void perimeter(){

    }
}