public class Animal {

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    public void eat() {
        System.out.println("Animal is eating");
    }
    Animal(int IQ){
        this.IQ = IQ;
    }
    public int IQ;

    public int getIQ() {
        return IQ;
    }
}
