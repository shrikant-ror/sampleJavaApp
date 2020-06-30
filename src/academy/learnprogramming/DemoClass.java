package academy.learnprogramming;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}
public class DemoClass {

    enum Food {
        Burger,
        Pizza,
        WadaPav
    }

    public static void main(String[] args) {
        // abstraction using polymorphism
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();

        // abstraction using interface
        Truck truck = new Truck();
        truck.fourWheelerSound();
        truck.hornSound();

        // Call ENUM
        Level callEnum = Level.HIGH;
        System.out.println("callEnum HIGH: " + callEnum);
        System.out.println("callEnum LOW: " + Level.LOW);

        switchCaseDemo();

        for (Food myVar: Food.values()) {
            System.out.println(myVar);
        }

        // User input
//        scannerDemo();

        // date demo
        dateDemo();

        // date time formatter demo
        dateTimeFormatterDemo();

        // Arraylist
        arrayListDemo();

        // LinkedList Demo
        linkedListDemo();

        // Hashmap Demo
        hashMapDemo();

        // Exception Demo
        exceptionDemo();

        // Exception with throw
//        throwExceptionDemo(10);

        // File handling demo
        fileHandlingDemo();

        // Write into file
        writeToFile();

        // read file
        readFromFile();

        // delete file
        deleteFileDemo();
    }

    private static void deleteFileDemo(){
        try {
            File deleteFile = new File("sampleFile.txt");
            deleteFile.delete();
            System.out.println("File deleted successfully");
        }catch (Exception e) {
            System.out.println("Something went wrong while deleting file");
            e.printStackTrace();
        }
    }

    private static void readFromFile(){
        try {
            File newFile = new File("sampleFile.txt");
            Scanner readFile = new Scanner(newFile);
            while (readFile.hasNextLine()){
                String data = readFile.nextLine();
                System.out.println("*** " + data + " ***");
            }
            readFile.close();
        }catch (Exception e){
            System.out.println("Something went wrong while reading from file" + e.toString());
            e.printStackTrace();
        }

    }

    private static void writeToFile(){
        try{
            FileWriter newFile = new FileWriter("sampleFile.txt");
            newFile.write("Adding 1st line to file \n");
            newFile.write("Adding 2nd line to file \n");
            newFile.write("Adding 3rd line to file");
            newFile.close();
            System.out.println("Added few lines into the file");
        }catch (Exception e){
            System.out.println("Something went wrong while writing to the file file" + e.toString());
        }
    }

    private static void fileHandlingDemo(){
        File newFile = new File("sampleFile.txt");
        try {
            if (newFile.createNewFile()) {
                System.out.println("Created new file");
            } else {
                System.out.println("File already existed in given location");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong while creating file" + e.toString());
        }
    }

    private static void throwExceptionDemo(int minBalance){
        if(minBalance < 100){
            throw new ArithmeticException("Low balance in account....");
        }else {
            System.out.println("You can Purchase this item ");
        }
    }

    private static void exceptionDemo(){
        try {
            int[] numbers = {1,2,3,4};
            System.out.println(numbers[10]);
        }catch (Exception e){
            System.out.println("Something Went wrong in try block");
        } finally {
            System.out.println("Calling finally block");
        }
    }

    private static void hashMapDemo(){
        HashMap<String, String> h_mDemo = new HashMap<String, String>();
        h_mDemo.put("MH", "Maharashtra");
        h_mDemo.put("HR", "Harayana");

        System.out.println(h_mDemo);
    }

    private static void linkedListDemo(){
        LinkedList<String> carsLinkedList = new LinkedList<String>();
        carsLinkedList.add("Ritz");
        carsLinkedList.add("Desire");
        carsLinkedList.add("Tata Safari");

        System.out.println("Linked List Demo: " + carsLinkedList);
    }

    private static void arrayListDemo(){
        ArrayList<String> carsArray = new ArrayList<String>();
        carsArray.add("Ritz");
        carsArray.add("Desire");
        carsArray.add("xuv");
        carsArray.add("tuv");
        System.out.println(carsArray);

        System.out.println("1st element from arraylist: " + carsArray.get(0));
        System.out.println("last element from arraylist: " + carsArray.get(carsArray.size() - 1));
        carsArray.set(2, "baleno");
        System.out.println(carsArray);
        carsArray.remove(1);
        System.out.println(carsArray);

        Collections.sort(carsArray);

        for (String i : carsArray) {
            System.out.println(i);
        }
//        for (int i=0; i < carsArray.size(); i++){
//            System.out.println(carsArray.get(i));
//        }
    }

    private static void dateDemo(){
        System.out.println("Current Date: " + LocalDate.now());
        System.out.println("Current DateTime: " + LocalDateTime.now());
        System.out.println("Date after 3 days: " + LocalDate.now().plusDays(3));
        System.out.println("Date after 3 months: " + LocalDate.now().plusMonths(3));
        System.out.println("Date after 3 years: " + LocalDate.now().plusYears(3));
        System.out.println("Date after 3 weeks: " + LocalDate.now().plusWeeks(3));
    }

    private static void dateTimeFormatterDemo(){
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println("Local time is "+ localTime);
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Local time is "+ localTime.format(formattedTime));
    }

    public static void scannerDemo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("Please enter your age");
        int age = input.nextInt();

        System.out.println("Please enter your salary");
        double salary = input.nextDouble();

        System.out.println("Hi.. your basic details as follows:");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);
    }

    private static void switchCaseDemo(){
        Food foodVar = Food.Burger;

        switch (foodVar) {
            case Burger:
                System.out.println("I like Burger!!!");
                break;
            case Pizza:
                System.out.println("I like Pizza!!!");
                break;
            case WadaPav:
                System.out.println("I like WadaPav!!!");
        }
    }
}

// abstraction using polymorphism
abstract class Animal {
    abstract void animalSound();

    public void sleep(){
        System.out.println("ZZZZZZ!!!!");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("This is PIGIS sound: weeee weeee weee weee");
    }
}

// abstraction using interfaces
interface FourWheeler {
    public void fourWheelerSound();
    public void hornSound();
}

class Truck implements FourWheeler {
    public void fourWheelerSound(){
        System.out.println("Truck sound is Boom boom");
    }

    public void hornSound(){
        System.out.println("Truck horn sound is POMP POM");
    }
}

