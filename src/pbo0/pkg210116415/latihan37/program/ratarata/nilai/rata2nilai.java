/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0.pkg210116415.latihan37.program.ratarata.nilai;

import java.util.Scanner;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Rata-Rata Nilai
 */
class rata2nilai {
    double rataRata;
    double jmlNilai = 0;
    
    public void hitungNilai(int jmlMhs){
        int i;
        double nilai;
        Scanner scanner = new Scanner(System.in);
        
        for (i = 1; i <= jmlMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scanner.nextDouble();
            jmlNilai = jmlNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jmlNilai, int jmlMhs) {
        rataRata = jmlNilai / jmlMhs;
        return rataRata;
    }
    
}
