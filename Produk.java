import java.util.ArrayList;
import java.util.List;

public class Produk {
    private String nama;
    private double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Produk: " + getNama());
        System.out.println("Harga: " + getHarga());
    }
}

class ProdukElektronik extends Produk {
    private String merk;

    public ProdukElektronik(String nama, double harga, String merk) {
        super(nama, harga);
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Merk: " + getMerk());
    }
}

class TokoOnline {
    private List<Produk> produk;

    public TokoOnline() {
        produk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        this.produk.add(produk);
    }

    public void tampilkanProduk() {
        for (Produk produk : this.produk) {
            produk.tampilkanInformasi();
            System.out.println();
        }
    }
}

class FungsiPaket {
    public static void fungsi() {
        System.out.println("Ini adalah fungsi dari paket");
    }
}