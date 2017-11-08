package assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class HangmanGame extends Application {
public static String chosen;
public static ArrayList<String> list = new ArrayList(25);

	
	public static void main(String[] args) throws IOException, InterruptedException, InputMismatchException {
		//reading from a file
		System.out.println("Welcome to Hangman!  V 1.0");
		TimeUnit.SECONDS.sleep(2);
		System.out.print("Player 1, please choose from any of the following below (number only).");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.println();
				BufferedReader br = Files.newBufferedReader(Paths.get("src/assignment/wordlist.txt"));
				String line = br.readLine();
				int counter = 0;
				while (line != null) {
				System.out.println(counter + " " + line);
				list.add(line);
				line = br.readLine();
				counter++;
				}
				Scanner scan = new Scanner(System.in);
				System.out.println(list.get(0));
				int j = 0;
				try {
				int i = scan.nextInt();
				j = i;
				System.out.println("Success!");
				}
				
				catch(InputMismatchException e) {
					System.out.println("Invalid input.  Please try again. Numbers 0 to 24 only.");
				}
				if ((j < 0 || j > 25)) {
					System.out.println("Invalid input.  Please try again. Numbers 0 to 24 only.");
				}
				else {
				String theWord = list.get(j);
				chosen = theWord;
				}
				
				System.out.println(chosen);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
