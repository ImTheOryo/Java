package Concepts;

/*
    @override :
    Nous avons un porte-avion qui doit gérer plusieurs avions. Le porte-avion peut lancer des avions et chaque type d'avion peut avoir un comportement de décollage spécifique.

    Créer une classe Avion qui définit une méthode générique decoller().
    Créer des classes dérivées comme AvionDeChasse et AvionDeTransport, qui redéfiniront la méthode decoller() en fonction de leurs comportements spécifiques.
    Créer la classe PorteAvion qui gère une liste d'avions et permet de les faire décoller.
*/

    public class Exo_05 {
        public static void main(String[] args) {
           AvionDeTransport avionDeTransport = new AvionDeTransport();
           AvionDeChasse avionDeChasse = new AvionDeChasse();

           PorteAvion.avions.get(0).decoller();
           PorteAvion.avions.get(1).decoller();

        }
    }
