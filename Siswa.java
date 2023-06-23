/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_ppbo;

import java.util.ArrayList;
import java.util.List;

// Class untuk merepresentasikan mahasiswa
class Mahasiswa {
    private String nim;
    private String nama;
    private int umur;

    // Konstruktor mahasiswa
    public Mahasiswa(String nim, String nama, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
    }

    // Method untuk mendapatkan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // Method untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Method untuk mendapatkan umur mahasiswa
    public int getUmur() {
        return umur;
    }
}

// Class untuk merepresentasikan daftar mahasiswa
class DaftarMahasiswa {
    private List<Mahasiswa> mahasiswas;

    // Konstruktor daftar mahasiswa
    public DaftarMahasiswa() {
        mahasiswas = new ArrayList<>();
    }

    // Method untuk menambahkan mahasiswa ke daftar
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswas.add(mahasiswa);
    }

    // Method untuk menghapus mahasiswa dari daftar berdasarkan NIM
    public void hapusMahasiswa(String nim) {
        Mahasiswa mahasiswa = cariMahasiswa(nim);
        if (mahasiswa != null) {
            mahasiswas.remove(mahasiswa);
            System.out.println("Mahasiswa dengan NIM " + nim + " telah dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    // Method untuk mencari mahasiswa berdasarkan NIM
    public Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : mahasiswas) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    // Method untuk menampilkan daftar mahasiswa
    public void tampilkanDaftarMahasiswa() {
        if (mahasiswas.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
        } else {
            System.out.println("Daftar mahasiswa:");
            for (Mahasiswa mahasiswa : mahasiswas) {
                System.out.println("NIM: " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("Umur: " + mahasiswa.getUmur());
                System.out.println("-----------------------");
            }
        }
    }
}

// Class utama untuk menjalankan program
public class Siswa {
    public static void main(String[] args) {
        // Membuat objek daftar mahasiswa
        DaftarMahasiswa daftarMahasiswa = new DaftarMahasiswa();

        // Membuat beberapa objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("V3922037", "Ody Frans", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("V3922032", "Abidin", 20);
        Mahasiswa mahasiswa3 = new Mahasiswa("V3922050", "Asror Alva", 20);

        // Menambahkan mahasiswa ke daftar
        daftarMahasiswa.tambahMahasiswa(mahasiswa1);
        daftarMahasiswa.tambahMahasiswa(mahasiswa2);
        daftarMahasiswa.tambahMahasiswa(mahasiswa3);

        // Menampilkan daftar mahasiswa
        daftarMahasiswa.tampilkanDaftarMahasiswa();

        // Menghapus mahasiswa berdasarkan NIM
        daftarMahasiswa.hapusMahasiswa("190002");

        // Menampilkan daftar mahasiswa setelah penghapusan
        daftarMahasiswa.tampilkanDaftarMahasiswa();
    }
}

