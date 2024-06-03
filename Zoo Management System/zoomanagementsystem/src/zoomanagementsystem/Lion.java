/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

public class Lion extends Animal{
     // Constructor to initialize the fields using the superclass constructor
    public Lion(String name, int age) {
        super(name, age);
    }
// Overrides the makeSound method to print "Roar"
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
    
}
