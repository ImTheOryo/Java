package Methods;

    public class Compteur {
        private static int nombreCompteur;

        public static void incrementer (int valeur){
            nombreCompteur += valeur;
        }

        static void afficherCompteur(){
            System.out.println("Compteur : " + nombreCompteur);
        }
    }
