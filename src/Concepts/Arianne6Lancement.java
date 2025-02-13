package Concepts;

public class Arianne6Lancement extends Ariane6{

    public Arianne6Lancement(String name, double poids) {
        super(name, poids);
        System.out.println("Fusée " + name + " créée, Poids : " + poids + "kg.");
        super.lancer();

    }
}
