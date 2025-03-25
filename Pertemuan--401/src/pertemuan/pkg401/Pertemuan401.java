/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg401;

import java.util.Scanner;

/**
 *
 * @author aca
 * nim 2301010091
 * tanggal : 25 Maret 2025
 */
public class Pertemuan401 {

 
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        String[] nama = new String[7];
        
        for(int y=0;y<7;y++){
            System.out.print("Isi data Teman : ");
            nama[y] = inp.nextLine();
        }
        
        //Menampilkan nama yang sudah ada
        //nama[0] = "Rimuru";
        //nama[1] = "Diablo";
        //nama[2] = "Tanjiro";
        //nama[3] = "Anos";
        //nama[4] = "Yuji";
        //nama[5] = "Gojo";
        //nama[6] = "Nanami";
        
        //menampilkan satu satu 
        //System.out.println("Data ke -1: "+nama[0];
        
        //menampilkan semua nama / data 
        //for (int i = 0; i < nama.length; i++) {
            //System.out.println("Data ke-" + (i + 1) + " : " + nama[i]);
        //}
        
        //for(String x : nama){
            //System.out.println(x);
        //}
        
      
        
    }
    
}
