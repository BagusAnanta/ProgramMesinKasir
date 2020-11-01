package com.LatihanSederhana;
import java.util.Scanner;

class Menu{
   Scanner UserInput = new Scanner(System.in);
   private String NamaIcecream;
   private int Harga = 0;
   boolean islanjutkan = true;

 
    void Display(){

        while(islanjutkan){
        System.out.println("===== Selamat Datang Di Kedai Ice Cream =====");
        System.out.println("Silahkan Masukan Jenis Ice Cream : ");
        System.out.println("1) Sunday Ice cream Chocolate");
        System.out.println("2) Sunday Ice cream Strawberry");
        System.out.println("3) Cone Ice Cream Chocolate");
        System.out.println("4) Cone Ice Cream Strawberry");
        System.out.println("5) Cone Ice Cream Matcha");
        System.out.print("Silahkan Masukkan Pilihan : ");
        String PilihanUser = UserInput.next();
        System.out.print("Silahkan Masukkan Banyak Pesanan : ");
        int BanyakPesan = UserInput.nextInt();
        System.out.print("Masukkan Uang Pelanggan : ");
        int UangPelanggan = UserInput.nextInt();
       
 
        switch (PilihanUser){
            case "1" :
            String NamaIcecream = "Sunday Ice Cream Choclate";
            int Harga1 = 10000;
            Harga = Harga + Harga1 * BanyakPesan;
            getBon(NamaIcecream, Harga, BanyakPesan,UangPelanggan);
            break;
            case "2" :
            NamaIcecream = "Sunday Ice Cream Strawberry";
            int Harga2 = 15000;
            Harga = Harga + Harga2 * BanyakPesan;
            getBon(NamaIcecream, Harga, BanyakPesan,UangPelanggan);
            break;
            case "3" :
            NamaIcecream = "Cone Ice Cream Choclate";
            int Harga3 = 5000;
            Harga = Harga + Harga3 * BanyakPesan;
            getBon(NamaIcecream, Harga, BanyakPesan,UangPelanggan);
            break;
            case "4" :
            NamaIcecream = "Cone Ice Cream Strawberry";
            int Harga4 = 7000;
            Harga = Harga + Harga4 * BanyakPesan;
            getBon(NamaIcecream, Harga, BanyakPesan,UangPelanggan);
            break;
            case "5" :
            NamaIcecream = "Cone Ice Cream Matcha";
            int Harga5 = 10000;
            Harga = Harga + Harga5 *BanyakPesan;
            getBon(NamaIcecream, Harga, BanyakPesan,UangPelanggan);
            break;
            default :
            System.out.println("Maaf, Pilihan Tidak Ada");
 
        }
        islanjutkan = getyesorno("Apakah Anda Ingin Melanjutkan");
    }
}

private int getKembalian(int HargaIceCream,int UangPelanggan){
    int HitungUangkembalian = UangPelanggan - HargaIceCream;
    return HitungUangkembalian;
}


private void getBon(String NamaMakanan,int TotalHarga,int jumlahitem,int UangPelanggan){
    System.out.println("======== Kedai Icecream ========");
    System.out.println("Nama Item   : " + NamaMakanan);
    System.out.println("Jumlah Item : " + jumlahitem);
    System.out.println("====================================");
    System.out.println("Total Harga    : " + TotalHarga);
    System.out.println("Uang Kembalian : " + getKembalian(TotalHarga, UangPelanggan));
    System.out.println("=====================================");
    System.out.println("Terima Kasih Atas Kunjungannya");
    System.out.println("=====================================");
}
   public boolean getyesorno(String Message){
    Scanner UserInput = new Scanner(System.in);
    System.out.println("\n" + Message + "(y/n)" + ": ");
    String Pilihanuser = UserInput.next();

    while(!Pilihanuser.equalsIgnoreCase("y") && !Pilihanuser.equalsIgnoreCase("n")){
        System.out.println("Pilihan Tidak Sesuai,silahkan pilih ulang");
        System.out.println("\n" + Message + "(y/n)" + ": ");
        Pilihanuser = UserInput.next();
    }
    return Pilihanuser.equalsIgnoreCase("y");
   }
   
}

public class ProgramMKasirIceCream {
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        menu1.Display();
        
    }
}
