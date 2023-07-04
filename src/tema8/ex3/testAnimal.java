package tema8.ex3;

public class testAnimal {
    public static void main(String[] args) {
        Cat british = new Cat();
        System.out.println(british.talk());
        Dog corgi = new Dog();
        System.out.println(corgi.talk());
        Mouse chitz = new Mouse();
        System.out.println(chitz.walk());
        Chicken redHead = new Chicken();
        System.out.println(redHead.talk());
        Duck duffy = new Duck();
        System.out.println(duffy.talk());
    }
}
