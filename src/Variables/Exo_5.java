package Variables;

import java.util.Optional;

public class Exo_5 {
    public static void main(String[] args) {
        Integer valeur = null;

        Integer resultat = Optional.ofNullable(valeur).orElse(42);

        System.out.println(resultat);
    }
}
