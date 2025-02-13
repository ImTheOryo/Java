package Concepts;
/*
    Encapsulation :
    Dans une usine de production de voitures, chaque voiture possède des caractéristiques comme le modèle, la couleur et le prix.
    Ces informations doivent être encapsulées, c'est-à-dire qu'elles ne doivent être accessibles qu'à travers des méthodes définies.

    Créez une classe Voiture avec des attributs privés : modele, couleur, prix.
    Fournissez des méthodes publiques pour accéder et modifier ces attributs (getters et setters).
    Assurez-vous que la méthode prix ne peut être modifiée qu'avec une valeur positive.
    Ajoutez une méthode afficherDetails() qui affiche les informations sur la voiture.
*/
    public class Exo_02 {
        public static void main(String[] args) {
            Voiture voiture = new Voiture("Rav4", "Noir", -45);

            System.out.println(voiture.getCouleur());
            System.out.println(voiture.getPrix());
            System.out.println(voiture.getModele());

            voiture.setCouleur("Blanc");
            voiture.setPrix(4500.98);
            voiture.setModele("Focus");

            voiture.afficherDetails();
        }
    }
