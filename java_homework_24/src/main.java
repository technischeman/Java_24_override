public class main {
    public static void main(String[] args) {
        cember cember=new cember();
        kare kare=new kare();
        dikdörtgen dikdörtgen=new dikdörtgen();
        cember.setYaricap(5);
        double cembercevre=cember.cevrehesapla();
        System.out.println("cember cevresi:"+cembercevre);
        double cemberalan=cember.alanhesapla();
        System.out.println("cember alani:"+cemberalan);
        kare.setKenar(5);
        double karecevre= kare.cevrehesapla();
        System.out.println("karecevresi:"+karecevre);
        System.out.println("karealan:"+kare.alanhesapla());
        dikdörtgen.setKisakenar(5);
        dikdörtgen.setUzunkenar(7);
        System.out.println("dikdörtgen cevre:"+dikdörtgen.cevrehesapla());
        System.out.println("dikdörtgen alan:"+dikdörtgen.alanhesapla());






    }
}

