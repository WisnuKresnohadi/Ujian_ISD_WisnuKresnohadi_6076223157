//PROGRAM INI TIDAK SEMPURNA NAMUN BUKAN BERARTI CACAT HANYA TERDAPAT KETERBATASAN DALAM MENGINPUT DAN MENDELETE DATA YANG HANYA BISA DILAKUKAN DI DEPAN DAN DI BELAKANG
//JADI TIDAK MELAKUKAN INPUT ATAU DELETE DI TENGAH
//PRINT YANG DI JALANKAN JUGA TIDAK MENGGUNAKAN HAL SPESIFIK JADI PROGRAM INI AKAN PRINT SEMUA DATA JADI TIDAK BISA PRINT SPESIFIK DATA

public class Pegawai {
    private String nip, nama, divisi;

    public Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getDivisi() {
        return divisi;
    }

    @Override
    public String toString() {
        return "NIP : " + getNip() + "\nNama : " + getNama() + "\nDivisi : " + getDivisi();
    }

}
