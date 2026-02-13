public class Main {
    public static void main(String[] args) {
        System.out.println("starting at 2 and adding 3");
        AdditionPattern plus3 = new AdditionPattern(2, 3);
        System.out.println(plus3.currentNumber());
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.next();
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.prev();
        plus3.prev();
        plus3.prev();
        System.out.println(plus3.currentNumber());
        plus3.prev();
        System.out.println(plus3.currentNumber());
        System.out.println("\nstarting at 10 and adding 4");
        AdditionPattern plus4 = new AdditionPattern(10, 4);
        System.out.println(plus4.currentNumber());
        plus4.next();
        System.out.println(plus4.currentNumber());
        plus4.next();
        plus4.next();
        System.out.println(plus4.currentNumber());
        plus4.prev();
        plus4.prev();
        plus4.prev();
        System.out.println(plus4.currentNumber());
        plus4.prev();
        System.out.println(plus4.currentNumber());
        plus4.prev();
        System.out.println(plus4.currentNumber());
    }
}