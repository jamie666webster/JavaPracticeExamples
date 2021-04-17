import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAverage {

    public static void main(String[] args) {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        // create a new Arraylist of type Integer to accept whole numbers
        ArrayList<Integer> list = new ArrayList<>();
        // use while loop to accept inouts until  -1 is inputed
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            list.add(input); //  add each input to the ArrayList
        }

        System.out.println( "");

        // assign a value ot sum  make it  an Integer
        int sum = 0;
        // use a for each loop to go thru numbers and add them up to  sum
        for (int number : list ){
            sum += number;
        }
        // assign an int for obtaining the amount of numbers entered to calculate the average
        int length = list.size();

        // assign average value as a double  and calculate
        double average = (sum * 1.0) / length;

        System.out.println("Sum of numbers is " + sum);
        System.out.println("Average is " + average);
    }
}
