package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexey");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p1 = new Point(9, 8);
        Point p2 = new Point(2, 2);
        System.out.println("Расстояние между точками A с координатами X = " + p1.x + "  и Y = " + p1.y + "  и B с координатами Х = " + p2.x + " и У = " + p2.y + " равняется " + distance(p1, p2));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + " ! ");

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y));


    }
}