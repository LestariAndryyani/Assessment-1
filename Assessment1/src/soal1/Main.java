package soal1;

class MarketPlace{
    private String namaPenjual= "Eiger";
    private String alamatPenjual= "Bandung Kopo";
    private String namaPembeli;
    private String alamatPembeli;
    private float ongkosKirim;
    private String namaEkspedisi;
    private String noResi;
    private int noTransaksi;
    private float nominalAsuransi;
    private String statusAsuransi;
    private String namaDropshipper;
    private String alamatDropshipper;
    private String statusDropshipper;
    private String jenis;

    //data utama
    public MarketPlace(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                       String alamatPenjual, String namaPembeli, String alamatPembeli){
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
    }
    //data utama + data asuransi
    public MarketPlace(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                       String alamatPenjual, String namaPembeli, String alamatPembeli, float nominalAsuransi,
                       String statusAsuransi){
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
    }
    //data utama + data dropshipper
    public MarketPlace(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                       String alamatPenjual, String namaPembeli, String alamatPembeli, String namaDropshipper,
                       String alamatDropshipper, String statusDropshipper){
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.statusDropshipper = statusDropshipper;
    }
    //data utama + data asuransi + data dropshipper
    public MarketPlace(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                       String alamatPenjual, String namaPembeli, String alamatPembeli, float nominalAsuransi, String statusAsuransi,
                       String namaDropshipper, String alamatDropshipper, String statusDropshipper){
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.statusDropshipper = statusDropshipper;

    }

    //cetak
    public void cetakAsuransiDropshipper (){
        System.out.println();
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaDropshipper);
        System.out.println("Alamat Pengirim : " + alamatDropshipper);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);
        System.out.println("Nominal Asuransi: " + nominalAsuransi);
        System.out.println();
    }
    public void cetakAsuransi(){
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaPenjual);
        System.out.println("Alamat Pengirim : " + alamatPenjual);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);
        System.out.println("Nominal Asuransi: " + nominalAsuransi);
        System.out.println();
    }
    public void cetakNormal(){
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaPenjual);
        System.out.println("Alamat Pengirim : " + alamatPenjual);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);
        System.out.println();
    }
    public void cetakDropshipper(){
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaDropshipper);
        System.out.println("Alamat Pengirim : " + alamatDropshipper);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);
    }
}

public class Main {
    public static void main(String[] args) {
        //Asuransi dan Dropshipper
        MarketPlace asuransiDropshipper = new MarketPlace("Asuransi dan Dropship", 1, "N0001",
                "JNE", 21000, "Udin", "Surabaya","Bejo",
                "DayeuhKolot", 40000,"Aktif", "DropShip1",
                "Surabaya", "Aktif");
        asuransiDropshipper.cetakAsuransiDropshipper();

        //Asuransi
        MarketPlace asuransi = new MarketPlace("Asuransi", 2, "N0003",
                "J&T", 16000, "Eiger", "Bandung Kopo", "Tini",
                "DayeuhKolot", 40000,"Aktif");
        asuransi.cetakAsuransi();

        //Normal
        MarketPlace normal = new MarketPlace( "Normal", 3, "N0004",
                "Pos Indonesia", 23000, "Eiger", "Bandung Kopo",
                "Bambang", "DayeuhKolot");
        normal.cetakNormal();

        //Dropshipper
        MarketPlace dropshipper = new MarketPlace("Dropship", 4, "N0002",
                "siCepat", 24000, "Asep", "Pontianak", "Joko",
                "DayeuhKolot", "DropShip2", "Pontianak", "Aktif");
        dropshipper.cetakDropshipper();
    }
}
