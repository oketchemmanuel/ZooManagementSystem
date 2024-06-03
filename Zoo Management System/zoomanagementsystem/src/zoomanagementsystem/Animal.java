/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoomanagementsystem;

/**
 *
 * @author oketchemmanuel
 */
// Base class for all animals in the zoo
public class Animal {
    // Fields for storing the name and age of the animal
    private String name;
    private int age;

    // Constructor to initialize the fields
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age field
    public int getAge() {
        return age;
    }

    // Setter method for the age field
    public void setAge(int age) {
        this.age = age;
    }

    // Method that will be overridden in subclasses to make the animal sound
    public void makeSound() {
        System.out.println("This animal makes a sound");
    }

    // Method that will be overridden in subclasses to define how the animal eats
    public void eat() {
        System.out.println("This animal is eating");
    }

    // Overloaded method to make the animal sound multiple times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound(); // Calls the makeSound method
        }
    }

    // Overloaded method to specify the type of food the animal eats
    public void eat(String foodType) {
        System.out.println("This animal is eating " + foodType);
    }
}

