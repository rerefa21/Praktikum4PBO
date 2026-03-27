/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author anindya
 */
public class Pegawai {
    
    private String id;
    private String nama;
    private String departemen;

    public Pegawai(String id, String nama, String departemen) {
        this.id = id;
        this.nama = nama;
        this.departemen = departemen;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getDepartemen() {
        return departemen;
    }
}

