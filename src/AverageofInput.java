import java.util.Scanner;

public class AverageofInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5;i++){
            System.out.print("Adj meg egy számot: ");
            sum += scn.nextInt();
        }
        System.out.println("A beírt számok összege: " + sum);
        System.out.println("Átlaguk: " + (float)sum/5);


    }
}