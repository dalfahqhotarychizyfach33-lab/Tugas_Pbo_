package TugasPalalan3;

public class Persegi {
    int sisi;
    int luas;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void hitungSisi() {
        luas = sisi * sisi;
    }

    public void info() {
        System.out.println("Luas Persegi dengan sisi " + sisi + " adalah " + luas);
    }
}