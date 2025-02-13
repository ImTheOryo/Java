package Concepts;

    public abstract class Animal {
        public String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat (){
            System.out.println("eating...");
        }

        abstract void seDeplacer ();

    }
