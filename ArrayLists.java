import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        // create new ArrayList of type String named  teachers
        ArrayList<String> teachers = new ArrayList<>();
        // add strings to arraylist bu using  .add
        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        //
        int index = 0;

        if (index < teachers.size()){
            System.out.println(teachers.get(index)); // index = 0
            index = index + 1; // index = 1
        }
        if (index < teachers.size()){
            System.out.println(teachers.get(index)); // index = 1
            index = index + 1; // index = 2
        }
        if (index < teachers.size()){
            System.out.println(teachers.get(index)); // index = 2
            index = index + 1; // index = 3
        }
        if (index < teachers.size()){
            System.out.println(teachers.get(index)); // index = 3
            index = index + 1; // index = 4
        }
        if (index < teachers.size()){
            // this wil not be executed since index = 4 and teachers.size() = 4
            index = index + 1;
        }
        index = 0;
        // convert all if statements to while loop
        while (index < teachers.size()){
            System.out.println("while "+ teachers.get(index));
            index = index + 1;
        }
        // convert while loop to for loop
        for (int i = 0; i < teachers.size(); i++){
            System.out.println("for loop " + teachers.get(i) );
        }
        // create ArrayList and print them using numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // add ints using the .add

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // use a for loop to print them out
        for (int i = 0; i < numbers.size(); i ++){
            int number = numbers.get(i);
            System.out.println(number);
            //alternatively  use  :  System.out.println(numbers.get(i));
        }
        // will now print numbers in reverse order using below code
        // dont use index  as it causes error as its already defined
        System.out.println("Numbers in reverse");
        int indexA = numbers.size() - 1;
        while (indexA >= 0) {
            int number = numbers.get(indexA);
            System.out.println(number);
            indexA = indexA -1;
        }



    }

}