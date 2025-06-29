import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class RussianRoulette {
    public static void main(String[] args) {
        playSound("nan.wav");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Russian Roulette");
        System.out.println("Rules: 1 bullet, 6 chambers");

        int bulletPosition = random.nextInt(6);
        int currentChamber = 0;
        int turn = 1;

        while (true) {
            if (turn % 2 == 1) {
                // User's turn
                System.out.println("\nYour turn: Press enter to pull the trigger.");
                sc.nextLine();
            } else {
                // Computer's turn
                System.out.println("\nComputer's turn: Pulling the trigger...");
            }

            try {
                System.out.println("Spinning the chamber");
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(500);
                    System.out.println(".");
                }
                System.out.println();

                Thread.sleep(800);
                System.out.println("Click!");

                if (currentChamber == bulletPosition) {
                    Thread.sleep(500);
                    if (turn % 2 == 1) {
                        System.out.println("Boom! You're dead..");
                        System.out.println("Computer wins!");
                    } else {
                        System.out.println("Boom! Computer is dead..");
                        System.out.println("You win!");
                    }
                    break;
                } else {
                    System.out.println("Safe... for now.");
                }

                currentChamber = (currentChamber + 1) % 6;
                turn++;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        System.out.println("\nGame over.");
        sc.close();
    }

    private static void playSound(String soundFile) {
        Runnable task = () -> {
            File file = new File(soundFile);
            try {
                AudioInputStream ais = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
                clip.close();
                ais.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        new Thread(task).start();
    }
}
