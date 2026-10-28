package TugasPalalan3;

public class PersegiPanjang {
    int panjang;
    int lebar;
    int luas;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungPersegiPanjang() {
        luas = panjang * lebar;
    }

    public void info() {
        System.out.println("Luas Persegi Panjang (" + panjang + " x " + lebar + ") adalah " + luas);
    }
}