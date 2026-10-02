public class factorialrecursion {
    public static void main(String[] args) {
        int output=fact(5);
        System.out.println(output);
    }
    static int fact(int num){
        if (num==0){
            return 1;
        }
        return num*fact(num-1);
    }

}