package animal;

import Edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: rorrrrrr";
    }

    @Override
    public String howToEat() {
        return "How to eat: could be fried";
    }
}
