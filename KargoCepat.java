/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4;

/**
 *
 * @author anindya
 */


import java.util.ArrayList;
import java.util.Iterator;

public class KargoCepat {
    public static void main(String[] args) {
        
        ArrayList<Integer> muatanTruk = new ArrayList<>();

        muatanTruk.add(12);
        muatanTruk.add(8);
        muatanTruk.add(25);
        muatanTruk.add(5);
        muatanTruk.add(30);

        System.out.println("Data paket awal: " + muatanTruk);

        try {
            Iterator<Integer> iterator = muatanTruk.iterator();

            while (iterator.hasNext()) {
                int berat = iterator.next();

                
                if (berat > 25) {
                    throw new ArithmeticException("Overload!");
                }

                
                if (berat < 10) {
                    System.out.println("Paket " + berat + " kg dihapus (di bawah 10 kg)");
                    iterator.remove();
                }
            }

            System.out.println("Data paket setelah pengecekan: " + muatanTruk);

        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Proses dibatalkan! Ditemukan paket melebihi 25 kg.");
        }
    }
}
