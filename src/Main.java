public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



//If-sats:
if (6 >= 3) {
        System.out.println("Hello, World!");
        }


        //Användarnamn med if-sats:

        import java.util.Scanner;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ditt användarnamn: ");
        String username = scanner.nextLine();

        if (username.equals("noname")) {
        System.out.println("Welcome!");
        }




    //Användarnamn och lösenord med if-sats:


    import java.util.Scanner;

    Scanner scanner = new Scanner(System.in);
System.out.print("Ange ditt användarnamn: ");
    String username = scanner.nextLine();
System.out.print("Ange ditt lösenord: ");
    String password = scanner.nextLine();

if (username.equals("noname") && password.equals("nopass")) {
        System.out.println("Welcome!");
    } else {
        System.out.println("Wrong username or password");
    }


//For-loop som skriver ut "Hello, World" 32 gånger:

    for (int i = 0; i < 32; i++) {
        System.out.println("Hello, World");
    }



    //While-loop för att skriva in rätt lösenord:

    import java.util.Scanner;

    Scanner scanner = new Scanner(System.in);
    String password = "";
while (!password.equals("nopass")) {
        System.out.print("Ange lösenord: ");
        password = scanner.nextLine();
    }
System.out.println("Welcome!");




//Loop som körs 5 gånger och jämför tal:
    import java.util.Scanner;

    Scanner scanner = new Scanner(System.in);
for (int i = 0; i < 5; i++) {
        System.out.print("Ange ett tal: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 5) {
            System.out.println("Högre än 5!");
        }
    }


//Loop som körs tills användaren skriver in en konverterbar int:
    import java.util.Scanner;

    Scanner scanner = new Scanner(System.in);
    int number = 0;
    boolean validInput = false;

while (!validInput) {
        System.out.print("Ange ett tal: ");
        String input = scanner.nextLine();
        try {
            number = Integer.parseInt(input);
            validInput = true;
        } catch (NumberFormatException e) {
            System.out.println("Ogiltig inmatning. Försök igen.");
        }
    }
System.out.println("Du angav talet: " + number);






//Gissa siffran" -spel:
    import java.util.Scanner;
import java.util.Random;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int secretNumber = random.nextInt(100) + 1;
    int userGuess = 0;

while (userGuess != secretNumber) {
        try {
            System.out.print("Gissa en siffra mellan 1 och 100: ");
            userGuess = Integer.parseInt(scanner.nextLine());

            if (userGuess < secretNumber) {
                System.out.println("För lågt! Försök igen.");
            } else if (userGuess > secretNumber) {
                System.out.println("För högt! Försök igen.");
            } else {
                System.out.println("Grattis, du gissade rätt!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ogiltig inmatning. Försök igen.");
        }
    }



}