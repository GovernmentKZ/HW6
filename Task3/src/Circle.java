public class Circle {
    public int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public int findArea(){
        return (int) (3.14 * Math.pow(radius,2));
    }
}
