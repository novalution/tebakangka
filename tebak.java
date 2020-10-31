/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Random;
import java.util.Scanner;
public class tebak {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int bil = 101;
    int int_random = rand.nextInt(bil);
    int ngisi;
    void pembuka(){
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
    }
    void menebak(){
        while (this.ngisi != this.int_random){
            System.out.print("Masukan Tebakan Anda : ");
            this.ngisi = input.nextInt();
            if(this.ngisi == this.int_random){
                System.out.println("Yeeee… Bilangan tebakan anda BENAR!");
                break;
            }
            else if(this.ngisi > this.int_random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            }
            else if(this.ngisi < this.int_random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
        }
    }
}
