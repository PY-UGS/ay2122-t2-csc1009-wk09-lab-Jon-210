
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRandomCharacter extends RandomCharacter{
    RandomCharacter testCharacters = new RandomCharacter();

    @Test   // tests the getRandomLowerCaseLetter() function to see if it generates a random lower case character
    public void testLowerCase() {
        char charLC = testCharacters.getRandomLowerCaseLetter();  // generate a lower case character from the function
        boolean flag = false; // set 'flag out error' to false

            if (Character.isLowerCase(charLC)) { // use in-built isLowerCase()

                // if character is lower case, print out the generated character in the debug terminal to check
                System.out.println("The character " + charLC + " is a Lowercase letter");
                flag = false;

            } else {
                // if character is not lower case, set flag to true and throw exception
                flag = true;
                throw new IllegalArgumentException("Generated String is not Lower Case");

            }
            // ensures that there is not 'flag out error'
            assertFalse(flag);
    }

    
    @Test // tests the getRandomUpperCaseLetter() function to see if it generates a random upper case character
    public void testUpperCase() {
        char charUC = testCharacters.getRandomUpperCaseLetter(); // generate a upper case character from the function
        boolean flag = false; // set 'flag out error' to false

            if (Character.isUpperCase(charUC)) { // use in-built isUpperCase()

                // if character is upper case, print out the generated character in the debug terminal to check
                System.out.println("The character " + charUC + " is an Uppercase Letter");
                flag = false;
                
            } else {
                // if character is not upper case, set flag to true and throw exception
                flag = true;
                throw new IllegalArgumentException("Generated String is not Upper Case");

            }
            // ensures that there is not 'flag out error'
            assertFalse(flag);
    }

    
    @Test // tests the getRandomDigitCharacter() function to see if it generates a random digit character
    public void testDigitCase() {
        char charDC = testCharacters.getRandomDigitCharacter(); // generate a digit character from the function
        boolean flag = false;
            if (Character.isDigit(charDC)) { // use in-built isDigit()

                // if character is a digit, print out the generated character in the debug terminal to check
                System.out.println("The character " + charDC + " is a Digit");
                flag = false;

            } else {
                // if character is not a digit, set flag to true and throw exception
                flag = true;
                throw new IllegalArgumentException("Generated String is not a Digit");

            }

            // checks to see if the digit generated is above or equal to 0 and lesser than 10 
            if (charDC >= 0 && charDC < 10){
                
                flag = false;

            }
            // ensures that there is not 'flag out error'
            assertFalse(flag);
    }

    
    @Test // tests the getRandomCharacter() function to see if it generates a random alphanumeric character
    public void testCharCase() {
        char charC = testCharacters.getRandomCharacter(); // generate an alphanumeric character from the function
        boolean flag = false;

            // use in-builts to test if the character is either a lower case, upper case or a digit
            if (Character.isLowerCase(charC) || Character.isUpperCase(charC) || Character.isDigit(charC)) {

                // if character is an alphanumeric, print out the generated character in the debug terminal to check
                System.out.println("The character " + charC + " is an Alphanumeric");
                flag = false;

            } else {
                // if character is not an alphanumeric, set flag to true and throw exception
                flag = true;
                throw new IllegalArgumentException("Generated String is not an Alphanumeric");
            
            }
            // ensures that there is not 'flag out error'
            assertFalse(flag);
    }

    @Test
    public void isPrime() {
        int[] array = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        // test array below with non prime number, test case fails
        // int[] array = new int[]{6, 3, 5, 8};
        
        for (int i = 0; i < array.length; i++){

            // ensures that all integers in int[] being tested in isPrime() is a prime, set all prime numbers to true
            // ensures that all tested prime numbers are true, test case fails if it is false.            
            assertTrue(testCharacters.isPrime(array[i]) == true); 
        }
    }
}
