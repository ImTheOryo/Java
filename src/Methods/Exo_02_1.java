package Methods;

public class Exo_02_1 {
    public static void main(String[] args) {
        Personne personne = new Personne("Yvette","25 Jeanne D'Arc", 75 );

        personne.afficherAddresse();
        personne.afficherNom();
        personne.afficherAge();
        //personne.changerNom("Hello");
    }
}
