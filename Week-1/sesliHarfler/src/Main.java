import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char [] sesliHarfler = {'A','a','E','e','I','ı','İ','i','O','o','Ö','ö','U','u','Ü','ü'};
        char harf = 'İ' ;



        switch (harf) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Kalin sesli harf girdiniz.");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ü':
            case 'ü':
            case 'Ö':
            case 'ö':
                System.out.println("Ince sesli harf girdiniz.");
                break;
            default:
                System.out.println("Yanlis harf girdiniz.");
        }




    }
}
