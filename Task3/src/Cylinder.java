public class Cylinder extends Circle{
    private int length;
    Cylinder(int length, int radius){
        super(radius);
        this.radius = radius;
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public int findVolume(){
        return (int) (3.14 * Math.pow(radius, 2) * length);
    }
}
