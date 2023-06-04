import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";

        System.out.println("Введіть п'ять слів:");

        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();
            sentence = sentence.concat(word + " ");
        }

        System.out.println("Результат: " + sentence.trim());
    }
}
