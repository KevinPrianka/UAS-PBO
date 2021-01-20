package uaspbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros-u
 */
import java.util.*;
public class TicketMachine extends main {
    //deklarasi variabel
    public static String Nama, JenisKendaraan, Tujuan;
    public static int hargaTiket, Diskon, Total;
   
    //KONSTRUKTOR
    public TicketMachine(String nama, String JKendaraan, String tujuan, int harga, int diskon, int total)
    {
    Nama = nama;
    JenisKendaraan = JKendaraan;
    Tujuan = tujuan;
    hargaTiket  = harga;
    Diskon = diskon;
    Total = total;
    }
    
    public void tampilan (){
    System.out.println("=======================================");
    System.out.println("              HARGA TIKET              ");
    System.out.println("---------------------------------------");
    System.out.println("1. Pesawat              Rp. 585.000,-");
    System.out.println("2. Kereta Api           Rp. 332.000,-");
    System.out.println("3. Bus                  Rp. 190.000,-");
    System.out.println("4. Air Space            Rp. 1.333.999,-");
    System.out.println("---------------------------------------");
    System.out.println("                 Tujuan                ");
    System.out.println("---------------------------------------");
    System.out.println("1. Jakarta                             ");
    System.out.println("2. Amerika                             ");
    System.out.println("3. Bandung                             ");
    System.out.println("---------------------------------------");
    System.out.println("                  MENU                 ");
    System.out.println("---------------------------------------"); 

}
//INPUT NAMA PENUMPANG
    public String nama (String nama){
    Scanner in = new Scanner (System.in);
    nama = in.nextLine();
    return nama;
}
    
//PILIHAN KENDARAAN
public String dataKendaraan (String vehicle) {
    JenisKendaraan = vehicle;
    switch (vehicle) {
        case "1" :
            JenisKendaraan = "PESAWAT";
            break;
        case "2" :
            JenisKendaraan = "KERETA API";
            break;
        case "3" :
            JenisKendaraan = "BUS";
            break;
        case "4" :
            JenisKendaraan = "AIR SPACE";
            break;
    }
        return JenisKendaraan;
}

//MENENTUKAN TUJUAN
public String dataTujuan (String opt) {
    switch (opt) {
        case "1" : Tujuan = "Jakarta";
            break;    
        case "2" : Tujuan = "Amerika";
            break;
        case "3" : Tujuan = "Bandung";
            break;
    }
    return Tujuan;
}

//MENENTUKAN HARGA TIKET
public int datahargaTiket (String vehicle) {
    JenisKendaraan = vehicle;
    switch (vehicle) {
        case "1" : hargaTiket = 585000;
            break;
        case "2" : hargaTiket = 332000;
            break;
        case "3" : hargaTiket = 190000;
            break;
        case "4" : hargaTiket = 1333999;
            break;
    }
    return hargaTiket;
}
    
//DISKON
public int totalDiskon(String dis){
Tujuan = dis;
    
//    if("Jakarta".equals(dis)){
//        Diskon = hargaTiket * 4 / 100;
//    }
//    else if("Amerika".equals(dis)){
//        Diskon = hargaTiket * 6 / 100;
//    }
//    else if("Bandung".equals(dis)){
//        Diskon = hargaTiket * 8 / 100;
//    }
//    return Diskon;

    switch(dis) {
        case "Jakarta" : Diskon = hargaTiket * 4 / 100;
            break;
        case "Amerika" : Diskon = hargaTiket * 6 / 100;
            break;
        case "Bandung" : Diskon = hargaTiket * 8 / 100;
            break;
    }

        return Diskon;
}

//TOTAL HARGA TIKET
public int totalHarga (int total){
Total = total;
total = hargaTiket - Diskon;
        return Total;
}

public void cetakTiket (String nama, String JKendaraan, String tujuan, int harga, int diskon, int total) {
    System.out.println("=======================================");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("=======================================");
    System.out.println("              TIKET " + dataKendaraan(JKendaraan));
    System.out.println("=======================================");
    System.out.println("Nama Penumpang : " + nama);
    System.out.println("Tujuan         : " + tujuan);
    System.out.println("Jarak Tujuan   : --- ");
    System.out.println("Jenis Kendaran : " + dataKendaraan(JKendaraan));
    System.out.println("Harga Tiket    : " + harga);
    System.out.println("Diskon         : " + diskon);
    System.out.println("Total Biaya    : " + totalHarga(total));
    System.out.println("=======================================");
}  
   
}

