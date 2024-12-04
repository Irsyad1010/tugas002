/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas002;



public class MathRun {
    public static void main(String[] args) {
       
        System.out.println("Hasil pertambahan (dua angka): " + Matematika.pertambahan(12.5, 28.7));
        System.out.println("Hasil pengurangan: " + Matematika.pengurangan(28.7, 12.5));
        System.out.println("Hasil perkalian: " + Matematika.perkalian(12.5, 28.7));
        System.out.println("Hasil pembagian: " + Matematika.pembagian(28.7, 12.5));
        System.out.println("Hasil modulus: " + Matematika.modulus(28.7, 12.5));

        System.out.println();
        System.out.println("Hasil pertambahan (tiga angka): " + Matematika.pertambahan(12.5, 28.7, 14.2));

        
        System.out.println("Overloading 1 (12, 28, 14): " + Matematika.pertambahan(12, 28, 14));
        System.out.println("Overloading 2 (3.4, 4.9): " + Matematika.pertambahan(3.4, 4.9));
        System.out.println("Overloading 3 (23, 34): " + Matematika.pertambahan(23, 34));
    }
}
