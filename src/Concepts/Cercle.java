package Concepts;

    public class Cercle extends Forme {
        private int rayon = 0;
        public Cercle (int rayon) {
            this.rayon = rayon;
        }
        @Override
        void calculerSurface() {
            System.out.println(Math.PI*Math.exp(rayon));
        }
    }
