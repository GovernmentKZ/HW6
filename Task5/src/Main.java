public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method();
        a = new B();
        a.method();
        B b = new B();
        b.method();
    }
}