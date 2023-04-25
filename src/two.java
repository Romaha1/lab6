import java.util.Scanner;

public class two {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            String word = sc.nextLine();
            String letter = word.substring(0,1);
            System.out.println(letter);
        }
    }
}
