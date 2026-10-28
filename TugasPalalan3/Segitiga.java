package TugasPalalan3;

public class Segitiga {
    double alas;
    double tinggi;
    double luas;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void hitungSegitiga() {
        luas = 0.5 * alas * tinggi;
    }

    public void info() {
        System.out.println("Luas Segitiga (alas: " + alas + ", tinggi: " + tinggi + ") adalah " + luas);
    }
}