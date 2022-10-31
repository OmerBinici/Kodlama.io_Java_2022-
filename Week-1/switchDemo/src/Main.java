public class Main {
/*
 2 ya da daha fazla case için aynı çıktı alınmak istendiğinde iki case alt alta yazılır ve sadece tek println yazılır.
 örneğin:
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
*/
public static void main (String[]  args)  {
        char grade = 'V';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");


        }

    }
}
