/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

public class zoo {
        public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Rani", 10);
        Monkey monkey = new Monkey("Mango", 3);

        System.out.println("Lion:");
        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("meat");

        System.out.println("\nElephant:");
        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2);
        elephant.eat("grass");

        System.out.println("\nMonkey:");
        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4);
        monkey.eat("bananas");
    }
}
