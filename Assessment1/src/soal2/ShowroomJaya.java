package soal2;

import java.util.ArrayList;

class Mobil{
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, String tahunKeluaran, double harga, int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }
    String getMerk(){
        return merk;
    }
    String getTahunKeluaran(){
        return tahunKeluaran;
    }
    double getHarga(){
        return harga;
    }
    int getStok(){
        return  stok;
    }
    void setStok(int stok){
        this.stok = stok;
    }
    void setHarga(double harga){
        this.harga = harga;
    }
    public void displayInfo(){
        System.out.println();
        System.out.println("Showroom Mobil - Jaya Penjualan");
        System.out.println("INPUT");
        System.out.println("Merk : " + getMerk());
        System.out.println("Harga : " + getHarga());
        System.out.println("Tahun Keluaran : " + getTahunKeluaran());
        System.out.println("Sisa Stok : " + getStok());
    }
}
class ShowroomJaya {
    static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {
        Mobil mbl = new Mobil("Aston Martin", "2019", 394000000,  4);
        tambahMobil(mbl);

        viewStok();
        beliMobil("Aston Martin", "2019", 5);
    }

    public static void tambahMobil(Mobil mbl) {
        arrMobil.add(mbl);
    }

    public static void beliMobil( String merk, String tahun, int jumlahBeli) {
        System.out.println();
        System.out.println("Merk : " + merk);
        System.out.println("Tahun Keluaran : " + tahun);
        System.out.println("Jumlah : " + jumlahBeli);

        for (Mobil mbl : arrMobil) {
            if (merk.equalsIgnoreCase(mbl.getMerk())
                    && tahun.equalsIgnoreCase(mbl.getTahunKeluaran())
                    && jumlahBeli < mbl.getStok()) {

                mbl.setStok(mbl.getStok() - jumlahBeli);
                double disc = 0.0;
                double hargaDiskon = 0.0;

                System.out.println();
                System.out.println("Merk : " + mbl.getMerk());
                System.out.println("Harga Satuan : " + mbl.getHarga());
                System.out.println("Tahun Keluaran : " + mbl.getTahunKeluaran());
                System.out.println("Jumkah Beli : " + jumlahBeli);
                System.out.println("Total Harga : " + mbl.getHarga() * jumlahBeli);

                double total = mbl.getHarga() * jumlahBeli;

                if (jumlahBeli == 1) {
                    disc = 0.0;
                    hargaDiskon = disc;
                }
                if (jumlahBeli == 2) {
                    disc = 10.0;
                    hargaDiskon = total * 10 / 100;
                    mbl.setHarga(hargaDiskon);
                }
                if (jumlahBeli > 2) {
                    disc = 20.0;
                    hargaDiskon = total * 20 / 100;
                    mbl.setHarga(hargaDiskon);
                }
                System.out.println("Diskon : " + disc + " persen");
                System.out.println("Total Diskon : " + hargaDiskon);
                System.out.println("Total Bayar : " + (total - hargaDiskon));
            } else {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi");
            }

        }

    }
    public static void viewStok() {
        for (Mobil mbl : arrMobil) {
            mbl.displayInfo();
        }
    }
}

