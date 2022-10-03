package loopDemo;

/*
     @author Sedat KURNALI
 */
public class Main {
    public static void main(String[] args) {
        // for
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("End of the for loop");

        int i = 1;
        // While
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("End of the while loop");

        // Do - While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("End of the do - while loop");
    }
}
