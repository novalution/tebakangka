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
public class tebak2 {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int jumlah = 0;
    int bil = 101;
    int int_random = rand.nextInt(bil);
    int ngisi;
    int score = 100;
    int tebakan = 1;
    void pembuka2(){
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
    }
    void menebak2(){
        while (this.ngisi != this.int_random){
            System.out.print("Masukan Tebakan Anda : ");
            this.ngisi = input.nextInt();
            this.jumlah = this.jumlah + 1;
            this.score = this.score - 2;
            this.tebakan = this.tebakan + 1;
            if(this.ngisi == this.int_random){
                System.out.println("Yeeee… Bilangan tebakan anda BENAR!");
                this.score = this.score + 2;
                if(this.tebakan <= 5){
                    this.score = this.score + 50;
            }
                System.out.println("Score Anda :" + this.score);
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