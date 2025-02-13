package Concepts;

    public class Oiseau extends Animal{

        public Oiseau(String name) {
            super(name);
        }

        @Override
        void seDeplacer() {
            System.out.println(this.voler());
        }

        public String voler () {
            return "L'Oiseau vole";
        }
    }
