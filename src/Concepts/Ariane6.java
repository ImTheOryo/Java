package Concepts;

public class Ariane6 extends Fusee{

    public Ariane6(String name, double poids) {
        super(name, poids);
        System.out.println("La fusée " + this.name + " commence son lancement avec une poussée spécifique.");

    }

}
