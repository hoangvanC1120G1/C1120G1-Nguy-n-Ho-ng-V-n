package bai7_abstract_interface.thuc_hanh.tiger;

import bai7_abstract_interface.thuc_hanh.animal.Animal;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}
