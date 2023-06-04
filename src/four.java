import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше ім'я:");
        String first = sc.nextLine().trim();
        System.out.println("Введіть друге ім'я:");
        String second = sc.nextLine().trim();
        if(first.equals(second)){
            System.out.println("Імена ідентичні");
        } else {
            System.out.println("Імена НЕ ідентичні");
        }
        sc.close();
    }
}
