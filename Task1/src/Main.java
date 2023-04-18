public class Main {
    public static void main(String[] args)
    {
        Shape sh1 = new Shape("Word");
        System.out.println(sh1.getShapeName());
        Circle sh2 = new Circle("Circle");
        System.out.println(sh2.getShapeName());
        Rectangle sh3 = new Rectangle("Rectangle");
        System.out.println(sh3.getShapeName());
        Triangle sh4 = new Triangle("Triangle");
        System.out.println(sh4.getShapeName());
    }
}
