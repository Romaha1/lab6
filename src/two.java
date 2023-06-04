import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть п'ять слів:");

        for (int i = 0; i < 5; i++) {
            String word = scanner.next();
            String firstLetter = word.substring(0, 1);
            System.out.println("Перша літера слова \"" + word + "\": " + firstLetter);
        }

        scanner.close();
    }
}

