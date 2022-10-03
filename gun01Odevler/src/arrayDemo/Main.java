package arrayDemo;

/*
     @author Sedat KURNALI
 */
public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Salih";
        String ogrenci2 = "Musa";
        String ogrenci3 = "Isa";
        String ogrenci4 = "Zekeriya";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------");

        String[] ogrenciArr = new String[4];

        ogrenciArr[0] = "Salih";
        ogrenciArr[1] = "Musa";
        ogrenciArr[2] = "Isa";
        ogrenciArr[3] = "Zekeriya";

        for (int i = 0; i < ogrenciArr.length; i++) {
            System.out.println(ogrenciArr[i]);
        }
    }
}
