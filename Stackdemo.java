import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        LinkedList bucket = new LinkedList();

        bucket.push("Toy1");
        bucket.push("Toy2");
        bucket.push("Toy3");
        bucket.push("Toy4");
        bucket.push("Toy5");

        while (!bucket.isEmpty()) {
            System.out.println(bucket.pop());
        }
    }
}




