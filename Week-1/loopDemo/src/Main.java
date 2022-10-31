public class Main {
    /*
    i++  >>>>> sayıları 1'er 1'er artır demek
    i+=2 >>>>> sayıları 2'şer 2'şer artır demek

     */
    public static void main(String[] args) {
        // For
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");


        //While
        int i = 1;
        while(i<10) {
            i++;
            System.out.println(i);
        }
        System.out.println("While DÖngüsü Bitti");

        // Do-While
        int j = 100;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While DÖngüsü Bitti");


    }
}
