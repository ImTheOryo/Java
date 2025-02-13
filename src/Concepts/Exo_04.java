package Concepts;
/*
    Abstraction :
    Crée une classe abstraite Forme avec une méthode abstraite calculerSurface().
    Crée deux sous-classes Cercle et Rectangle :

    Dans la classe Cercle, implémente la méthode calculerSurface() pour calculer la surface d'un cercle avec la formule π * rayon².
    Dans la classe Rectangle, implémente la méthode calculerSurface() pour calculer la surface d'un rectangle avec la formule largeur * hauteur.

    Ensuite, dans la classe principale, crée des objets de type Cercle et Rectangle et appelle la méthode calculerSurface() sur chacun d'eux.

*/
    public class Exo_04 {
        public static void main(String[] args) {
            Cercle cercle = new Cercle(5);
            cercle.calculerSurface();

            Rectangle rectangle = new Rectangle(56,5);
            rectangle.calculerSurface();
        }
    }
