package Methods;

import java.util.Scanner;

public class Exo_03 {
        public static void main(String[] args) {
            Calculatrice calculatrice = new Calculatrice();

            double result = calculatrice.effectuerOperation("sous", 200, 58 );
            double result2 = calculatrice.effectuerOperation("sous", 60, 42.58);

            String res = Double.toString(result);
            System.out.println(res.replace("42.0", "Vous avez trouver l'Easter Egg en faisant une soustraction et que le reste fasse 42 "));

            String res2 = Double.toString(result2);
            System.out.println(res2.replace("42.", "Vous avez trouver l'Easter Egg en faisant une soustraction et que le reste fasse 42 "));

        }
    }