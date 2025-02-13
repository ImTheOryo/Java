package Concepts;

    public class Mammifere extends Animal{

        public Mammifere(String name) {
            super(name);
        }

        @Override
        void seDeplacer() {
            System.out.println(this.marcher());
        }

        public String marcher(){
            return "Un Mammifère marche";
        }

    }
