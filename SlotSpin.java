import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SlotSpin {
    public static void main(String[] args) {
        // scanner declaration 
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // welcome message / game instructions
        System.out.println("Hello user, this program will spin a slot machine");
        System.out.println("to win you must get 3 emojis in a row, if not you lose.");
        System.out.print("Do you want to spin? Enter yes (y) to start or no (n) to quit: ");

        // Reads user input
        String input = sc.next();

        try {
            // Check user input, starts if user typed 'y' or 'yes'
            if (input.startsWith("y")) { // https://www.w3schools.com/jsref/jsref_startswith.asp
                boolean keepPlaying = true;

                // Game loop for spinning the slots
                do {
                    // Generate a random number (1-6) for each slot
                    int num1 = random.nextInt(6) + 1;
                    int num2 = random.nextInt(6) + 1;
                    int num3 = random.nextInt(6) + 1;

                    // Use each number to pick an emoji
                    String emoji1;
                    String emoji2;
                    String emoji3;

                    // first emoji picked
                    if (num1 == 1) {
                        emoji1 = "🍒";
                    } else if (num1 == 2) {
                        emoji1 = "🍋";
                    } else if (num1 == 3) {
                        emoji1 = "🔔";
                    } else if (num1 == 4) {
                        emoji1 = "⭐";
                    } else if (num1 == 5) {
                        emoji1 = "🍉";
                    } else {
                        emoji1 = "7️⃣";
                    }

                    // second emoji picked
                    if (num2 == 1) {
                        emoji2 = "🍒";
                    } else if (num2 == 2) {
                        emoji2 = "🍋";
                    } else if (num2 == 3) {
                        emoji2 = "🔔";
                    } else if (num2 == 4) {
                        emoji2 = "⭐";
                    } else if (num2 == 5) {
                        emoji2 = "🍉";
                    } else {
                        emoji2 = "7️⃣";
                    }

                    // third emoji picked
                    if (num3 == 1) {
                        emoji3 = "🍒";
                    } else if (num3 == 2) {
                        emoji3 = "🍋";
                    } else if (num3 == 3) {
                        emoji3 = "🔔";
                    } else if (num3 == 4) {
                        emoji3 = "⭐";
                    } else if (num3 == 5) {
                        emoji3 = "🍉";
                    } else {
                        emoji3 = "7️⃣";
                    }

                    // Show the spin results
                    System.out.print("spininggggggg");
                    Thread.sleep(1000); //https://www.geeksforgeeks.org/java/thread-sleep-method-in-java-with-examples/
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\nResult: " + emoji1 + " " + emoji2 + " " + emoji3);

                    // Check if all 3 numbers match (same number = same emoji)
                    if (num1 == num2 && num2 == num3) {
                        Thread.sleep(500); //https://www.geeksforgeeks.org/java/thread-sleep-method-in-java-with-examples/
                        System.out.println("WOW you did it!!!! You win yay!");
                    } else {
                        Thread.sleep(500); //https://www.geeksforgeeks.org/java/thread-sleep-method-in-java-with-examples/
                        System.out.println("Boo hoo you lost, don't be a quitter!");
                    }

                    // Prompt the user to spin again
                    System.out.print("Do you want to spin again? (y/n): ");
                    String choice = sc.next();

                    // Check if user wants to quit or continue
                    if (choice.startsWith("n")) { //https://www.w3schools.com/jsref/jsref_startswith.asp
                        keepPlaying = false;
                    } else if (choice.startsWith("y")) { //https://www.w3schools.com/jsref/jsref_startswith.asp
                        System.out.println();
                        keepPlaying = true;
                    }
                } while (keepPlaying);
            } else {
                // Runs if the initial input wasn't starting with 'y'
                System.out.print("please enter Y (yes) or N (no) next time");
                System.out.println();
            }
        } catch (InputMismatchException | InterruptedException e) {
            // Catch input errors if mismatch occurs
            System.out.println("Error: Please enter a valid input.");
        } finally {
            // Clean up resources and close Scanner
            System.out.println("Goodbye.");
            sc.close();
        }
    }
}