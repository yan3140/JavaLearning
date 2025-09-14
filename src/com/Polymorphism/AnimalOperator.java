package com.Polymorphism;

public class AnimalOperator {
//        public void useAnimal(Cat c) {
//            c.eat();
//        }
//        public void useAnimal(Dog d) {
//            d.eat();
//        }
        public void useAnimal(Animal a) {
            //Animal a = new Cat();自动向上转型
            //Animal a = new Dog();
            a.eat();
        }

}
