package Concepts;

    public class AvionDeChasse extends Avion {
        public AvionDeChasse() {
            super();
        }
        @Override
        void decoller () {
            System.out.println("L'avion de chasse décolle rapidement grace a sa puissance");
        }
    }
