import java.util.Random;
import java.util.Scanner;
public class guessNumGame {
    public static void main(String[] args) {
        
        Random r = new Random();
        int negunu = r.nextInt(100)+1;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number(1-100)");
            int gunu = sc.nextInt();
            if(gunu>negunu){
                System.out.println("too big!");
            }else if(gunu<negunu){
                System.out.println("too small!");
            }else {
                System.out.println("you right!");
                break;
            }
        }
    }
}