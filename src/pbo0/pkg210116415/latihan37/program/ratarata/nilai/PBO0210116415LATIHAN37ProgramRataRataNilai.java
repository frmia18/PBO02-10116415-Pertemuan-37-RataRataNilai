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
public class PBO0210116415LATIHAN37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jmlMhs;
        Scanner scanner = new Scanner(System.in);
        rata2nilai rata2 = new rata2nilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jmlMhs = scanner.nextInt();
        
        rata2.hitungNilai(jmlMhs);
        double jmlNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
                rata2.hitungRata2Nilai(rata2.jmlNilai,jmlMhs));
    }
    
}
