public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacakSayi = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi==aranacakSayi){
                varMi=true;
                break;
            }
        }

        if (varMi){
            System.out.println("Sayi mevcuttur");
        } else {
            System.out.println("Sayi mevcut degildir");
        }
    }
}
