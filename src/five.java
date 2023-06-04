import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший рядок:");
        String a = sc.nextLine().trim();
        System.out.println("Введіть другий рядок:");
        String b = sc.nextLine().trim();

        if (a.length() > b.length()) {
            System.out.println("Перший рядок довший");
        } else if (a.length() < b.length()) {
            System.out.println("Другий рядок довший");
        } else {
            System.out.println("Рядки мають однакову довжину");
        }
    }
}
