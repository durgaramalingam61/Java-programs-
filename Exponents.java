public class ExponentRecursion {
    public static void main(String[] args) {
        int output = exp(2, 5);
        System.out.println(output);
    }

    static int exp(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * exp(base, power - 1);
    }
}


