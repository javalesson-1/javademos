public class Main {
    public static void main(String[] args) {
        String sehirVer = sehirVer();
        System.out.println(sehirVer);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam = topla2(1, 2, 3, 4);
        System.out.println(toplam);
        System.out.println(varArg(1, 2, 3));
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Sildi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String varArg(int... sayi) {
        return "sayi:" + sayi[1];
    }
}
