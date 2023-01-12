import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;

public class chores {
    // Define the main function.
    public static void main(String[] args) throws IOException {
        // Declare two Array lists.
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> chore = new ArrayList<String>();
        // Create an object of BufferedReader class.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // Prompt the user to enter the number of chores and names.
        System.out.print("Please enter the count of " + "name and chores: ");
        // Store the user input count in the variable count.
        int count = Integer.parseInt(in.readLine());
        // Run a loop for inputting the names and their chores
        for (int i = 0; i < count; i++) {
            System.out.print("Please enter your name: ");
            name.add(in.readLine());
            System.out.print("Please enter your chore: ");
            chore.add(in.readLine());
        }
        // Print the names and their chores
        for (int i = 0; i < count; i++)
            System.out.println("Name: " + name.get(i) + ", Chore: " + chore.get(i));
        // Shuffle the chores
        Collections.shuffle(chore);
        // Print the names along with their shuffled chores
        for (int i = 0; i < count; i++)
            System.out.println("Random chore selected for name " + name.get(i) + " is " + chore.get(i) + ".");
    }
}