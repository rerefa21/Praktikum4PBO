/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author anindya
 */

  import java.util.ArrayList;

public class MainPegawai {
    public static void main(String[] args) {
        
        Pegawai p1 = new Pegawai("012110", "Uchiha Itachi", "SDM");
        
        Pegawai p2 = new Pegawai("33-001", "Sasori", "keuangan");
        
        Pegawai p3 = new Pegawai("IW-08721", "Haruno Sakura", "Produksi");

        
        ArrayList<Pegawai> listSDM = new ArrayList<>();
        listSDM.add(p1);
        
        ArrayList<Pegawai> listKeuangan = new ArrayList<>();
        listKeuangan.add(p2);
       
        ArrayList<Pegawai> listProduksi = new ArrayList<>();
        listProduksi.add(p3);
        

        
        System.out.println("--- Departemen SDM ---");
        for(Pegawai pegawai : listSDM) {
            System.out.println("ID: " + pegawai.getId());
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Departemen: " + pegawai.getDepartemen());
        }
        System.out.println("");

        
        System.out.println("--- Departemen Keuangan ---");
        for(Pegawai pegawai : listKeuangan) {
            System.out.println("ID: " + pegawai.getId());
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Departemen: " + pegawai.getDepartemen());
        }
        System.out.println("");

       
        System.out.println("--- Departemen Produksi ---");
        for(Pegawai pegawai : listProduksi) {
            System.out.println("ID: " + pegawai.getId());
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Departemen: " + pegawai.getDepartemen());
        }
        System.out.println("");
    }
}