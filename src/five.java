import java.util.Scanner;

public class five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        if(a.length() > b.length()){
            System.out.println("Перше більше");
        }else if(a.length() < b.length()) {
            System.out.println("Друге більше");
        }else System.out.println("Рівні");
    }
}
