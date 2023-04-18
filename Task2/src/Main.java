public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3);
        System.out.println("Площадь:" + rectangle.Arae()+ " Приметр:" + rectangle.Perimeter());
        Square square = new Square(4, 5);
        System.out.println("Площадь:" + square.Arae()+ " Приметр:" + square.Perimeter());
    }
}