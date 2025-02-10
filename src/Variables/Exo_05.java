package Variables;

import java.util.Optional;

public class Exo_05 {
    public static void main(String[] args) {
        Integer valeur = null;

        System.out.println(Optional.ofNullable(valeur).orElse(42));
    }
}
