package bai7_abstract_interface.thuc_hanh.chicken;

import bai7_abstract_interface.thuc_hanh.animal.Animal;
import bai7_abstract_interface.thuc_hanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
