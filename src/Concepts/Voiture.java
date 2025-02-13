package Concepts;

    public class Voiture {
        private String modele;
        private String couleur;
        private double prix;

        public Voiture(String modele, String couleur, double prix) {
            this.modele = modele;
            this.couleur = couleur;
            prix = Math.max(prix, 0);
            this.prix = prix;
        }

        public String getModele() {
            return modele;
        }

        public String getCouleur() {
            return couleur;
        }

        public double getPrix() {
            return prix;
        }

        public void setModele(String modele) {
            this.modele = modele;
        }

        public void setCouleur(String couleur) {
            this.couleur = couleur;
        }

        public void setPrix(double prix) {
            prix = Math.max(prix, 0);
            this.prix = prix;
        }

        public void afficherDetails () {
            System.out.printf("Modele: %s, Couleur : %s, Prix : %2f", modele, couleur, prix);
        }
    }
