package Concepts;

    public class Fusee {
        public String name;
        public double poids;
        public Fusee(String name, double poids) {
            this.name = name;
            this.poids = poids;

        }

        public void lancer(){
            System.out.println("La fusée " + name + " est en phase de lancement.");

        }
    }
