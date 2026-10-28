package TugasPalalan3;

public class Lingkaran {
    double jariJari;
    double luas;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungLuas() {
        luas = 3.14 * jariJari * jariJari;
    }

    public void info() {
        System.out.println("Luas Lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
    }
}