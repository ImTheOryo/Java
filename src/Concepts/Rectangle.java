package Concepts;

    public class Rectangle extends Forme {
        private double longeur = 0;
        private double largeur = 0;

        Rectangle(double longeur, double largeur) {
            this.longeur = longeur;
            this.largeur = largeur;
        }

        @Override
        void calculerSurface() {
            System.out.println(longeur*largeur);
        }
    }
