package assesment;
import java.time.Year;
import java.util.Random;

public class main {

    //Question 1
    //Create a method that only prints odd numbers from 10 down to 1

    //Question 2
    //Write a method that takes an array of integers and returns the sum of all numbers

    //Question 3
    //Create a method that calculates the average of the numbers in the array

    //Question 4
    //Create a method that generates a random number from 1 to 6

    //Question 5
    //Write a method that calculates the sum of all even numbers in the array

    //Question 6
    //Write a method that calculates the volume of a cube

    //Question 7
    //Write a method to count how many times a particular character appears in a string

    //Question 8
    //Create a method that determines if a string is a palindrome

    //Question 9
    //Create a method that check if a year is a leap year

    //Question 10
    //Create a method that first scans for a user's ticket number then scans for a user's destination in that order. USe the information to print the following:
    //"Now serving customer number [replace with ticket number]. Enjoy your trip to [replace with destination]".

    public static void main(String[] args) {

        //Q1
        int x = 10;
        System.out.println("Q1:");
        printOddNumbersCountdown(x);

        //Q2
        int[] myArray = {5, 10, 15, 20};
        arrayOfIntegers(myArray);

        //Q3
        int[] myArrayTwo = {5, 10, 15, 20};
        averageArray(myArrayTwo);

        //Q4
        int a = 6;
        randomNumber(a);

        //Q5
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Q5: Sum of all even numbers in the array is: " + evenNumbersArray(array));

        //Q6
        double sidelength = 10.0;
        double volume = cubeVolume(sidelength);
        System.out.println("Q6: Volume of cube is: " + volume);

        //Q7
        String string = "Hello world";
        char specificCharacter = 'o';
        int occurrences = countCharacters(string, specificCharacter);
        System.out.println("Q7: Times a particular character appears in a string is: " + occurrences);

        //Q8
        String str = "Racecar";
        str = str.toLowerCase();                                    //Convert the string to lower case
        boolean ans = isPalindrom(str);
        System.out.println("Q8: Is string a palindrome(T/F)?   " + ans);

        //Q9
        int year = 2024;
        System.out.println("Q9: Is the year in question (2024) a leap year?(T/F)    " + isLeapYear(year));

    }


    //Q1
    public static void printOddNumbersCountdown(int questionOne){
        for (int i = 10; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Q2
    public static int arrayOfIntegers (int[] questionTwo){
        int[] myArray = {5, 10, 15, 20};
        int sum = 0;
        int i;

        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Q2: The sum of my array is: " + sum);
        return sum;
    }

    //Q3
    public static int averageArray (int[] questionThree){
        int[] numbers = new int[] {5, 10, 15, 20};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        int average = sum / numbers.length;
        System.out.println("Q3: Average of the numbers in array is: " + average);
        return sum;
    }

    //Q4
    public static void randomNumber (int questionFour){
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(6);
            if(rand !=0) break;
        }
        System.out.println("Q4: " + rand);
    }

    //Q5
    public static int evenNumbersArray(int[] questionFive){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i: array)
            if (i % 2 == 0){
                sum += i;
            }
        return sum;
    }

    //Q6
    public static double cubeVolume (double sideLength){
        return sideLength * sideLength * sideLength;
    }

    //Q7
    public static int countCharacters(String input, char character){
        int count = 0;
        for (int i = 0; i <input.length(); i++){
            if (input.charAt(i) == character);
            count++;
        }
        return count;
    }

    //Q8
    public static boolean isPalindrom(String str){
        String rev = "";                                        // Initializing an empty string to store the reverse of the original str
        boolean answer = false;                                 // Initializing a new boolean variable for the answer
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }if (str.equals(rev)) {
            answer = true;
        }
        return answer;                                           // Checking if both the strings are equal
    }

    //Q9
    public static boolean isLeapYear(int years){
        int year = 2024;
        boolean isLeap = Year.of(year).isLeap();
        return isLeap;
    }



} //Class
