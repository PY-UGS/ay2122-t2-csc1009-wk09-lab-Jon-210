import java.util.Random;

public class RandomCharacter {
    Random random = new Random();
    static final String ALPHANUMERIC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // all possible alphanumerics
    static final int LENGTH = 15; // length of random generated characters
    static String randomLCString = " "; // stores 15 random generated lower case characters into a String
    static String randomUCString = " "; // stores 15 random generated upper case characters into a String
    static String randomDigitString = " "; // stores 15 random generated digit characters into a String
    static String randomCharString = " "; // stores 15 random generated alphanumeric characters into a String

    // getRandomLowerCaseLetter() generates a random integer and maps to char to get a lower case letter
    public char getRandomLowerCaseLetter() {
        char randomLowerCase = (char) ('a' + random.nextInt(26));
        return randomLowerCase;
    }

    // getRandomUpperCaseLetter() generates a random integer and maps to char to get a upper case letter
    public char getRandomUpperCaseLetter() {
        char randomUpperCase = (char) ('A' + random.nextInt(26));
        return randomUpperCase;
    }

    // getRandomDigitCharacter() generates a random integer and gets a digit from 0 to 9
    public char getRandomDigitCharacter() {
        char randomDigits = (char) ('0' + random.nextInt(10));
        return randomDigits;
    }

    // getRandomDigitCharacter() generates a random character from the ALPHANUMERIC String where there are lower case, upper case and digits
    public char getRandomCharacter() {
        char randomCharacter = ALPHANUMERIC.charAt(random.nextInt(ALPHANUMERIC.length()));
        return randomCharacter;
    }

    // isPrime() generates one character from each of the functions and converts them into an integer (ASCII form)
    public boolean isPrime(int value){
        int x = 2;
        int count = 0;
        
        // divides the value being tested by an increment of x++ if the value is divisible by x, the count increases, showing the number of times the value was divisible
        while (x < value) {
           if (value % x == 0) {
              count++; // count increases if mod is 0, value is divisible
              break;
           }
           x++; // increases x for next loop
        }
  
        if (count == 0) { // if count is 0, value was not divisible and hence, is a prime
           System.out.println("\n" + value + " is a Prime Number.");
           return true;
        } else { // if count is not 0, value was divisible and hence, is not a prime
           System.out.println("\n" + value + " is not a Prime Number.");
           return false;
        }
    }


    public static void main(String[] args) {
        RandomCharacter randomCharacters = new RandomCharacter();

        // generates 15 characters from each of the functions and adds it to their respective strings
        for (int i = 0; i < LENGTH; i++) {
            // after each iteration, add newly generated value to the respective strings
            randomLCString += randomCharacters.getRandomLowerCaseLetter();
            randomUCString += randomCharacters.getRandomUpperCaseLetter();
            randomDigitString += randomCharacters.getRandomDigitCharacter();
            randomCharString += randomCharacters.getRandomCharacter();

        }

        // Q1.
        // prints out the corresponding strings to display to the user
        System.out.println("15 Random Lower Case Letters: " + randomLCString);
        System.out.println("15 Random Upper Case Letters: " + randomUCString);
        System.out.println("15 Random Digit Characters: " + randomDigitString);
        System.out.println("15 Random Alphanumerical Characters: " + randomCharString);

    // Q2.
    // test if values generated in getRandomDigitCharacter() are prime numbers
    int length = randomDigitString.length(); // get the length of the string to iterate through

    for (int i = 1; i < length; i++) {  // iterate through each digit in the 15 random digit characters string

            char charDC = randomDigitString.charAt(i); 
            int value=Character.getNumericValue(charDC); // converts char to int at index i

            randomCharacters.isPrime(value);
        }
    }
}
