import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "Круг";
        if (input == "Круг") {
            double r = 5;
            if (r > 0) {
                Circle Michal = new Circle(r);
                System.out.println("Длинна окружности: " + Michal.getP());
                System.out.println("Площадь круга: " + Michal.getS());
            } else {
                throw new RuntimeException("There is no figure with such parameters.");
            }
        } else if (input == "Треугольник") {
            double a = 3, b = 4, c = 5;
            if (a > 0 && b > 0 && c > 0 && (a + b) > c && (b + c) > a && (a + c) > b) {
                Tringle Bill = new Tringle(a, b, c);
                System.out.println("Перимитр треугольника: " + Bill.getP());
                System.out.println("Площадь треугольника: " + Bill.getS());
            } else {
                throw new RuntimeException("There is no figure with such parameters.");
            }
        } else {
            double a = 3, b = 4;
            if (a > 0 && b > 0) {
                Rectangle Rec = new Rectangle(a, b);
                System.out.println("Перимитр Прямоугольника: " + Rec.getP());
                System.out.println("Площадь Прямоугольника: " + Rec.getS());
            } else {
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }
    }
}