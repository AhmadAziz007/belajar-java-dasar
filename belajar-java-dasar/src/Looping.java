import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        int n;
//        String massage;
//
//        System.out.println("Enter a massage and I'11 display it five time.");
//        System.out.println("Massage: ");
//        massage = keyboard.next();
//
//        for(n = 1 ; n <= 5 ; n++){
//            System.out.println(n + ". " + massage);
//        }
//        System.out.println("\nNow I'11 show it ten time and count by 5s");
//        for(n = 5 ; n <= 50 ; n += 5){
//            System.out.println(n + ". " + massage);
//        }
//        System.out.println("\nFinally, there time counting backward.");
//        for(n = 3 ; n > 0 ; n -= 1){
//            System.out.println(n + ". " + massage);
//        }

        Scanner input = new Scanner(System.in);
        int secret, guess;
        boolean pass = false;

        secret = 1 + (int)(Math.random()*10);
        System.out.println("I am thingking of number from 1 to 10");
        System.out.println("You must guess what it is in three tries");
        System.out.println("Enter guess: ");

        for (int i=0; i < 3; i++){
            guess = input.nextInt();
            if(guess == secret){
                System.out.println("Right");
                System.out.println("You have won game");
                pass = true;
                break;
            } else if(Math.abs(guess - secret) == 1){
                System.out.println("hot");
            } else if (Math.abs(guess - secret) == 2) {
                System.out.println("warm");
            } else {
                System.out.println("cold");
            }
        }
        System.out.println("wrong.");
        System.out.println("The correct number war " + secret + ". ");
        System.out.println("You lost the game");
    }
}
