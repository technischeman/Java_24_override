public class Baseclass {
    int kisakenar,uzunkenar,kenar;
    double yaricap,alan,cevre;

    public int getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(int kisakenar) {
        this.kisakenar = kisakenar;
    }

    public int getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(int uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double cevrehesapla(){
        cevre=(kisakenar+uzunkenar)*2;
        return cevre;
    }
    public double alanhesapla(){
        alan=kisakenar*uzunkenar;
        return alan;
    }
}