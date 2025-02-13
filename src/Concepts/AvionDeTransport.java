package Concepts;

    public class AvionDeTransport extends Avion {
        public AvionDeTransport(){
            super();
        }
        @Override
        void decoller (){
            System.out.println("L'avion de transport décolle plus difficilement a cause de son poids");
        }

    }
