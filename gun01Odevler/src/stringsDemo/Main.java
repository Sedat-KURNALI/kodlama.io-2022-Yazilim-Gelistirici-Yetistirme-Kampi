package stringsDemo;

import java.util.Arrays;

/*
     @author Sedat KURNALI
 */
public class Main {
    public static void main(String[] args) {
        String yazi = "   Aynisi olmasin diye kendi ornegimi yapayim dedim! ilanruK tadeS    ";
        System.out.println(yazi);

        // trim ile bosluklari alayim
        yazi = yazi.trim();
        System.out.println(yazi);

        // terse bir cevireyim
        String tmp = "";
        for (int i = yazi.length() - 1; i >= 0; i--) {
            tmp += yazi.substring(i, i + 1);
        }
        yazi = tmp;
        System.out.println(yazi);

        // nal kelimesini arayim
        System.out.println(yazi.indexOf("nal")); // 9 "nal" ?n gurundugu ilk indexi getirdi

        System.out.println(Arrays.toString(yazi.split(""))); // karakterlere ayirip arraye atmadim
        System.out.println(Arrays.toString(yazi.split(" "))); // kelimelere boldum
        for (String w : yazi.split(" ")) {// kelimelere boldum ve altalta yazdim ilk defa denedim arraye atamadan
            System.out.println(w);
        }

        System.out.println(yazi.replace("a", "e")); // a lar? e yaptim
        System.out.println(yazi.replaceAll("\\w", "")); // butun harf va yazilari yok ettim
        System.out.println(yazi.replaceAll("\\W", "")); // butun harf va yazilar haric yok ettim
        System.out.println(yazi.charAt(0)); // ilk karakteri yazar
        System.out.println(yazi.substring(0, 1)); // ilk karakteri yazar

    }
}
