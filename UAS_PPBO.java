/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas_ppbo;

// Class untuk merepresentasikan kalkulator
class Calculator {
    // Variabel instance untuk menyimpan hasil perhitungan
    private double result;

    // Konstruktor kalkulator
    public Calculator() {
        result = 0;
    }

    // Method untuk menambahkan dua bilangan
    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    // Method untuk mengurangkan dua bilangan
    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    // Method untuk mengalikan dua bilangan
    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    // Method untuk membagi dua bilangan
    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    // Method untuk mendapatkan hasil perhitungan
    public double getResult() {
        return result;
    }
}

// Class utama untuk menjalankan program
public class UAS_PPBO {
    public static void main(String[] args) {
        // Membuat objek kalkulator
        Calculator calculator = new Calculator();

        // Melakukan operasi penjumlahan
        calculator.add(5, 3);
        System.out.println("5 + 3 = " + calculator.getResult());

        // Melakukan operasi pengurangan
        calculator.subtract(10, 4);
        System.out.println("10 - 4 = " + calculator.getResult());

        // Melakukan operasi perkalian
        calculator.multiply(2.5, 3);
        System.out.println("2.5 * 3 = " + calculator.getResult());

        // Melakukan operasi pembagian
        calculator.divide(8, 2);
        System.out.println("8 / 2 = " + calculator.getResult());

        // Contoh pembagian dengan nol (Error)
        calculator.divide(6, 0);
    }
}
