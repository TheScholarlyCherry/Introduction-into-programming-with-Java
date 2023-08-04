package reading_U1;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Word_Association1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // User
        
        String user_answer1;
        
        // Word Bank
        
        String Ikaw = "You";
        String Mo = "You";
        String Ako = "Me";
        String Ko = "Me";
        String Ano = "What";
        String Gawa = "Doing"; // Verb
        String Ginagawa = "Doing"; // Present tense.

        // Conjunctions
        
        String At = "And";

        // Phrases
        
        String Kamusta_Ka = "How are you";
        String Ikaw_at_ako = "You and me";
        String Mahal_Kita = "I love you";
        String Ano_ginagawa_mo = "What are you doing";

        // Introduction
        
        // Words
        
        System.out.println("Type the correct word in Tagalog.");
        System.out.println("You: ");
        
        user_answer1 = scan.nextLine();

        if (user_answer1.equals(Ikaw)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong.");
        }
    }
}
