import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = " ";
        for(int i = 0; i < 5; i++){
            String word = sc.nextLine();
            text = text.concat(word + " ");
        }
        System.out.println(text);
    }
}