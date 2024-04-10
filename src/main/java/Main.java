import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość boku: ");
        int bok = scanner.nextInt();

        // Rysowanie trójkąta normalnego
        System.out.println("Trójkąt normalny:");
        for (int i = 0; i < bok; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == bok - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        // Rysowanie trójkąta odwróconego w poziomie
        System.out.println("\nTrójkąt odwrócony w poziomie:");
        for (int i = 0; i < bok; i++) {
            for (int j = 0; j < bok; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}