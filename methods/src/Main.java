public class Main {

    public static void main(String[] args) {

        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacakSayi = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer(aranacakSayi);
        } else {
            System.out.println("Sayi mevcut degildir" + aranacakSayi);
        }
    }

    public static void mesajVer(int aranacakSayi) {
        System.out.println("Sayi mevcuttur" + aranacakSayi);
    }

}
