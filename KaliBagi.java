/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author anindya
 */

public class KaliBagi {
    private Double a1;
    private Double a2;

    // Constructor
    public KaliBagi(Double a1, Double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    // Getter
    public Double getA1() {
        return a1;
    }

    public Double getA2() {
        return a2;
    }

    // Method perkalian
    public Double kali() {
        return a1 * a2;
    }

    // Method pembagian
    public Double bagi() {
        if (a2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return null;
        }
        return a1 / a2;
    }
}

