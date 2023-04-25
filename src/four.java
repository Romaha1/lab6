import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine(), second = sc.nextLine();
        if(first.equals(second)){
            System.out.println("Імена ідентичні");
        }else System.out.println("Імена НЕ ідентичні");
    }
}
