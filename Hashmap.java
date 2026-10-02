import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap scores = new HashMap();

        scores.put("Sharmila", 85);
        scores.put("Bala", 20);
        scores.put("Fahad", 52);

        scores.put("Fahad", 12);
        System.out.println(scores);

        if (scores.containsKey("Fahad")) {
            System.out.println("Fahad is present");
        }
    }
}


