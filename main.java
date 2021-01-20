package uaspbo;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
import static uaspbo.TicketMachine.Diskon;
import static uaspbo.TicketMachine.JenisKendaraan;
import static uaspbo.TicketMachine.Nama;
import static uaspbo.TicketMachine.Total;
import static uaspbo.TicketMachine.Tujuan;
import static uaspbo.TicketMachine.hargaTiket;

public class main {
public static void main(String[] arg) {
        //OBJECT TICKET MACHINE
        TicketMachine proses = new TicketMachine(Nama, JenisKendaraan,  Tujuan, hargaTiket, Diskon, Total);
        
        //MENAMPILAKAN PILIHAN
        proses.tampilan();
        
        //INPUTAN NAMA PENUMPANG
        System.out.print("> Nama Penumpang : ");
        String nama = proses.nama(Nama);
        
        //INPUTAN KENDARAAN DAN OUTPUT NAMA SERTA HARGA TIKET KENDARAAN
        System.out.print("> Pilih Kendaraan : ");
        String JKendaraan = proses.nama(JenisKendaraan);
        proses.dataKendaraan(JKendaraan);
        proses.datahargaTiket(JKendaraan);
        System.out.println("  -Jenis Kendaraan : " + proses.dataKendaraan(JKendaraan));
        System.out.println("  -Harga Tiket : " + proses.datahargaTiket(JKendaraan));
        
        //INPUTAN TUJUAN
        System.out.print("> Pilih Tujuan : ");
        String tujuan = proses.nama(Tujuan);
        proses.dataTujuan(tujuan);
        System.out.println("  -Tujuan : " + proses.dataTujuan(tujuan));
 
        //CETAK TIKET
        proses.cetakTiket(nama, JKendaraan, Tujuan, hargaTiket, Diskon, Total);
    }
}


