public class PolymorphismDemo {
    public static void main(String[] args) {
        PolyOverload poly = new PolyOverload();
        poly.welcome();
        poly.welcome("Spiderman");
    }
}

class PolyOverload {
    void welcome() {
        System.out.println("Welcome to the great VVIT");
    }

    void welcome(String name) {
        System.out.println("Welcome " + name);
    }
}



