import java.util.Scanner;

public class three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Введіть перше дійсне число:");
        if(sc.hasNextFloat()){
            a = sc.nextFloat();
            System.out.println("Ведіть друге дійсне число:");
            if(sc.hasNextFloat()){
                b = sc.nextFloat();
                System.out.println("Введіть третє дійсне число:");
                if(sc.hasNextFloat()){
                    c = sc.nextFloat();
                    if (a > b){
                        System.out.println(Math.max(a, c));
                    }else{
                        System.out.println(Math.max(b, c));
                    }
                }else System.out.println("Ви ввели не дійсне число!");
            }else System.out.println("Ви ввели не дійсне число!");
        }else System.out.println("Ви ввели не дійсне число!");
    }
}
