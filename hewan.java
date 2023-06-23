/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_ppbo;

// Class untuk merepresentasikan hewan peliharaan
class Pet {
    private String name;
    private int age;

    // Konstruktor hewan peliharaan
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method untuk mendapatkan nama hewan
    public String getName() {
        return name;
    }

    // Method untuk mendapatkan usia hewan
    public int getAge() {
        return age;
    }

    // Method untuk mengeluarkan suara hewan
    public void makeSound() {
        System.out.println("Hewan membuat suara");
    }
}

// Class untuk merepresentasikan kucing sebagai hewan peliharaan
class Cat extends Pet {
    private String color;

    // Konstruktor kucing
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Method untuk mendapatkan warna kucing
    public String getColor() {
        return color;
    }

    // Implementasi metode makeSound() untuk kucing
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Class utama untuk menjalankan program
public class hewan {
    public static void main(String[] args) {
        // Membuat objek kucing
        Cat cat = new Cat("Momo", 3, "Orange");

        // Menampilkan informasi kucing
        System.out.println("Nama: " + cat.getName());
        System.out.println("Usia: " + cat.getAge() + " tahun");
        System.out.println("Warna: " + cat.getColor());

        // Kucing membuat suara
        cat.makeSound();
    }
}

