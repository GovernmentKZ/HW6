import java.awt.geom.Area;

public class Square extends Rectangle{
    Square(int a, int b){
        super(a);
        this.b = b;
    }
    public int Arae(){
        return a * b;
    }
    public int Perimeter(){
        return 2*a + 2*b;
    }
}
