package Attributs;

    public class Compte {
        static int nombreDeComptes = 0;
        private String nom;

        public Void CreationCompte (String nom){
            this.nom = nom;
            nombreDeComptes++;
            return null;
        }
    }
