//PROGRAM INI TIDAK SEMPURNA NAMUN BUKAN BERARTI CACAT HANYA TERDAPAT KETERBATASAN DALAM MENGINPUT DAN MENDELETE DATA YANG HANYA BISA DILAKUKAN DI DEPAN DAN DI BELAKANG
//JADI TIDAK MELAKUKAN INPUT ATAU DELETE DI TENGAH
//PRINT YANG DI JALANKAN JUGA TIDAK MENGGUNAKAN HAL SPESIFIK JADI PROGRAM INI AKAN PRINT SEMUA DATA JADI TIDAK BISA PRINT SPESIFIK DATA

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Linklist<Pegawai> listPegawai = new Linklist();

    public static void main(String[] args) {
        int pilihMenu = 1;
        while (pilihMenu != 4) {
            System.out.println("1. Input Pegawai");
            System.out.println("2. Delete Pegawai");
            System.out.println("3. Show Pegawai");
            System.out.println("4. Keluar");
            pilihMenu = sc.nextInt();
            switch (pilihMenu) {
                case 1:
                    inputPegawai();
                    break;

                case 2:
                    deletePegawai();
                    break;
                case 3:
                    showPegawai();
                    break;
            }
        }
    }

    private static void inputPegawai() {
        String nip, nama, divisi = "";
        int pilihDivisi;
        System.out.println("1. Input Depan");
        System.out.println("2. Input Belakang");
        int pilihInput = sc.nextInt();
        sc.nextLine();
        switch (pilihInput) {
            case 1:
                System.out.print("NIP : ");
                nip = sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.println("1. Divisi SDM");
                System.out.println("2. Divisi IT");
                System.out.println("3. Divisi Administrasi");
                pilihDivisi = sc.nextInt();
                switch (pilihDivisi) {
                    case 1:
                        divisi = "Sumber Daya Manusia";
                        break;

                    case 2:
                        divisi = "IT";
                        break;
                    case 3:
                        divisi = "Administrasi";
                        break;
                }
                listPegawai.insertFront(new Pegawai(nip, nama, divisi));
                break;

            case 2:
                System.out.print("NIP : ");
                nip = sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.println("1. Divisi SDM");
                System.out.println("2. Divisi IT");
                System.out.println("3. Divisi Administrasi");
                pilihDivisi = sc.nextInt();
                switch (pilihDivisi) {
                    case 1:
                        divisi = "Sumber Daya Manusia";
                        break;

                    case 2:
                        divisi = "IT";
                        break;
                    case 3:
                        divisi = "Administrasi";
                        break;
                }
                listPegawai.insertBack(new Pegawai(nip, nama, divisi));
                break;
        }
    }

    private static void deletePegawai() {
        int pilihDelete;
        System.out.println("1. Delete Depan");
        System.out.println("2. Delete Belakang");
        pilihDelete = sc.nextInt();
        switch (pilihDelete) {
            case 1:
                listPegawai.deleteFront();
                break;
            case 2:
                listPegawai.deleteBack();
                break;
        }
    }

    private static void showPegawai() {
        listPegawai.printAll();
    }
}
