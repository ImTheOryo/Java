package Concepts;

/*

    Héritage :
    Dans un zoo, il existe plusieurs types d'animaux, tels que des mammifères, des oiseaux, et des reptiles.
    Tous les animaux ont certaines caractéristiques communes, comme un nom et une méthode pour manger.
    Cependant, chaque type d'animal a des comportements spécifiques. Par exemple, les oiseaux volent, tandis que les mammifères marchent.

    Créez une classe abstraite Animal avec un attribut nom et une méthode abstraite seDeplacer().
    Créez des sous-classes telles que Mammifere, Oiseau et Reptile qui héritent de Animal et redéfinissent la méthode seDeplacer().
    Ajoutez des méthodes spécifiques à chaque type d'animal, par exemple, voler() pour Oiseau et marcher() pour Mammifere.

*/


    public class Exo_01 {
        public static void main(String[] args) {
            Mammifere mammifere = new Mammifere("Dog");
            mammifere.seDeplacer();
            mammifere.eat();

            Oiseau oiseau = new Oiseau("Dodo");
            oiseau.seDeplacer();
            oiseau.eat();
        }
    }
