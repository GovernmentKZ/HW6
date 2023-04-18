import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(4);
        System.out.println(circle.findArea());
        Cylinder cylinder = new Cylinder(5, 4);
        System.out.println(cylinder.findVolume());
    }
}