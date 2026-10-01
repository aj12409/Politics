public class Main {

    public static void main(String[] args) {
// Declarations
        String democrat;
        String republican;
        String independent;

// User Input
        System.out.println("Enter D for Democrat");
        System.out.println("Enter R for Republican");
        System.out.println("Enter I for Independent");
        System.out.println("Enter other");

// User Input Simulation
        String choice = "R";

        if (choice.equals("D"))
        {
            System.out.println("You get a democratic donkey");
        }
        else if (choice.equals("R"))
        {
            System.out.println("You get a republican elephant");
        }
        else if (choice.equals("I"))
        {
            System.out.println("You get an independent person");
        }
        else
        {
            System.out.println("You selected other");
        }
