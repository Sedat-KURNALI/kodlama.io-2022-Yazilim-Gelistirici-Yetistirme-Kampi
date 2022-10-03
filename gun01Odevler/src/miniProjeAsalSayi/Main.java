package miniProjeAsalSayi;

/*
     @author Sedat KURNALI
 */
public class Main {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;
        if (number < 2) {
            System.out.println("Gecersiz sayi 1 den buyuk tamsayi olmali  ");
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (number == 2) {
            isPrime = true;
        }
        if (isPrime == true) {
            System.out.println("Sayi  asaldir");
        } else {
            System.out.println("Sayi asal degildir");
        }
    }
}
