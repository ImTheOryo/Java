package Attribut;

    public class Exo_04 {

        public static void main(String[] args) {
            Compte compte = new Compte();
            compte.CreationCompte("Toto");
            compte.CreationCompte("Tata");
            compte.CreationCompte("Titi");
            System.out.print(Compte.nombreDeComptes);
        }
    }
