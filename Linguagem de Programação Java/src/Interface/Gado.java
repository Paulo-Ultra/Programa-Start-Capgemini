package Interface;

import Interface.Animal;

public class Gado implements Animal {

    @Override
    public void animalSom() {
        System.out.println("Muuuuuu!");
    }

    @Override
    public Double animalComer() {
        return 15.0;
    }

    @Override
    public void animalAbrigo() {
        System.out.println("Estrebaria");
    }

    @Override
    public String toString() {
        return "Interface.Gado{}";
    }
}
