package bai7_abstract_interface.thuc_hanh.test;
import bai7_abstract_interface.thuc_hanh.animal.Animal;
import bai7_abstract_interface.thuc_hanh.chicken.Chicken;
import bai7_abstract_interface.thuc_hanh.tiger.Tiger;
import bai7_abstract_interface.thuc_hanh.edible.Edible;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }

}
