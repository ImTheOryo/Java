package Variables;

import java.util.Optional;

public class Exo_9 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 42 * (1));
        String stringRandom = String.valueOf(random);
        System.out.println("42".equals(stringRandom));
    }
}
