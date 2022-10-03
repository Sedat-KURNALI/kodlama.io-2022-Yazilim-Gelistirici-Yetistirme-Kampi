package multiDimentionArrayDemo;

/*
     @author Sedat KURNALI
 */
public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Zonguldak";
        sehirler[0][1] = "Bartin";
        sehirler[0][2] = "Karabuk";
        sehirler[1][0] = "Bolu";
        sehirler[1][1] = "Duzce";
        sehirler[1][2] = "Kastamonu";
        sehirler[2][0] = "Cankiri";
        sehirler[2][1] = "Ankara";
        sehirler[2][2] = "Sakarya";

        for (int i = 0; i <= 2; i++) {
            System.out.println("--------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
