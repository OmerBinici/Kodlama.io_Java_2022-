public class Main {

    public static void main(String[] args) {

        int[] sayilar = {1, 2, 5, 7, 9, 15};
        int aranacak = 1;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayi klasorde mevcuttur.");
        } else {
            System.out.println("Sayi klasorde mevcut degildir.");
        }


    }
}
