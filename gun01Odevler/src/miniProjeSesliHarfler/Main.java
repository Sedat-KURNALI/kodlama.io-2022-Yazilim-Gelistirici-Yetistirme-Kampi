package miniProjeSesliHarfler;

/*
     @author Sedat KURNALI
 */
public class Main {
    public static void main(String[] args) {
        char harf = 'i';
        if (Character.isAlphabetic(harf)) {
            switch (harf) {
                case 'A', 'a', 'I', '?', 'O', 'o', 'U', 'u':
                    System.out.println("Kalin Sesli Harf");
                    break;
                case 'E', 'e','i':
                    System.out.println("Ince Sesli Harf");
                    break;
                default:
                    System.out.println("Sessiz Harf");
                    break;
            }
        } else {
            System.out.println("Harf degildir");
        }
    }
}
