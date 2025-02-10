package Variables;

public class Exo_8 {
    public static void main(String[] args) {
        String [] myArray42 = "quarante-deux".split("");
        for (String s : myArray42) {
            System.out.println(s);
        }
        String my42 = String.join("", myArray42);
        String message = String.format("La grande réponse sur la vie, l’univers et le reste ! %s", my42);
        System.out.println(message);

    }
}
