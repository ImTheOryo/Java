package Concepts;

    public class Avion {

        public Avion() {
            PorteAvion.avions.add(this);
        }

        void decoller () {
            System.out.println("L'avion decolle");
        }
    }
