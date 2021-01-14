/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
import java.util.Scanner;
public class TicketMachineMain {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int Code;
        int Price;
        int option;
        System.out.println("=======================================");
        System.out.println("              HARGA TIKET              ");
        System.out.println("=======================================");
        System.out.println("1. Pesawat           Rp. 585.000,-");
        System.out.println("2. Kereta Api        Rp. 332.000,-");
        System.out.println("3. Bus               Rp. 190.000,-");
        System.out.println("4. Air Space         Rp. 1.333.999,-");
        System.out.println("=======================================");
        System.out.println("                  MENU                 ");
        System.out.println("1. Kode Tiket");
        System.out.println("2. Harga Tiket");
        System.out.println("3. Jumlah Saldo");
        System.out.println("4. Masukkan Uang");
        System.out.println("5. Cetak Tiket");
        System.out.println("6. Ambil Kembalian");
        System.out.println("7. Selesai");
        System.out.println("=======================================");

// if(pilihan != 1){
//     harga = 585000;
//     System.out.println("Pesawat " + "harga : Rp. " + harga);
// }else if(pilihan == 3){
//     harga = 332.000;
//     System.out.println("Kereta Api " + "harga : Rp. " + harga);
// }else if(pilihan == 4){
//     harga = 190000;
//     System.out.println("Bus " + "harga : Rp. " + harga);
// }else if(pilihan == 4){
//     harga = 1333999;
//     System.out.println("Air Space " + "harga : Rp. " + harga);
// }
// else{
//     System.out.println("Maaf Pilihan yang Anda Pilih Salah !");
// }else {
//  
//        }


        System.out.print("Masukkan Code Tiket :");
        Code = scan.nextInt();
        machineModel Tiket = new machineModel(Code);
        option = scan.nextInt();
       while(option != 7){    
            switch(option){
               case 1:
               Code = Tiket.getCode();
                System.out.println("Kode "+Code);
                break;
                case 2:
              Price = Tiket.getPrice();
              System.out.println("Harga: "+Price);
               break;
                case 3:
               System.out.println("Saldo: "+Tiket.getBalance());
               break;
                case 4:
                System.out.println("Masukkan uang:");
                Tiket.masuk(scan.nextInt());
                break;
                case 5:
                System.out.println("Print sejumlah:");
                int am = scan.nextInt();
                Tiket.print(am);
                break;
                case 6:
                if(Tiket.getBalance() > 0){
                    System.out.println("Kembalian sebesar: Rp "+Tiket.getBalance());
                    Tiket.kembali();
                }
                else System.out.println("Tidak ada kembalian");
                break;
            }
            option = scan.nextInt();
            if(option == 7) System.out.println("Terimakasih");
        }
    }
}

