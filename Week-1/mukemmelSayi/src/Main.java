public class Main {

    public static void main(String[] args) {

        int number = 8128;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
                System.out.println(i + " ");

            }

        }
        System.out.println("--------------------------");
        System.out.println(total);

        if (total == number) {
            System.out.println("Mukemmel sayidir.");
        } else {
            System.out.println("Mukemmel sayi degildir.");
        }


    }
}
