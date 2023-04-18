public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(0);
        Dog dog = new Dog(20);
        animal.sleep();
        animal.eat();
        animal = new Dog(30);
        System.out.println(dog.getIQ());
        animal.sleep();
        dog.bark();
        dog.sleep();
        Irshod irshod = new Irshod(100);
        System.out.println(irshod.getIQ());
    }
}