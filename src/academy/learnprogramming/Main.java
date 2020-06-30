package academy.learnprogramming;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int num = 10;
        System.out.println(num);
        double num1 = num;
        System.out.println(num1);

        String data = String.valueOf(num);
        System.out.println(data);

        int n1 = 10, n2 = 5;
        System.out.println("Addition:" + (n1 + n2));
        System.out.println("Subtraction:" + (n1 - n2));
        System.out.println("Multiplication:" + (n1 * n2));
        System.out.println("Division:" + (n1 / n2));

        String str = "Hello World";
        String str1 = "its me!!!";
        System.out.println("Lower case: " + str.toLowerCase());
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("index of 'W' in string is " + str.indexOf("W"));
        System.out.println(str + " " + str1);
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        int maxVal = Math.max(200, 989);
        System.out.println("Max Value: " + maxVal);
        int minVal = Math.min(200, 9890);
        System.out.println("min Value: " + minVal);

        double squrt = Math.sqrt(164);
        System.out.println("sqrt Value: " + squrt);

        System.out.println("abs Value: " + Math.abs(-4.7));

        System.out.println("Random number:" + Math.random());

        if (n1 < n2) {
            System.out.println("n1 is less than n2");
        } else if ( n1 == n2){
            System.out.println("n1 and n2 are equal");
        } else {
            System.out.println("n1 is greater than n2");
        }

        String res = n1 < n2 ? "YES" : "NO";
        System.out.println(res);

//        Array aa = [1, 2, 3];

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.getClass().getName());
        System.out.println(cars.getClass().isArray());
//        System.out.println(Array.);
        System.out.println(str.length());
        String input = "Android gave new life to Java";
        boolean isFound = input.indexOf("Android") != -1;
        System.out.println(isFound);
        myMethod();
        myMethod("Shrikant");

        int addition = addition(5, 10);
        System.out.println("Called addition method " + addition);

        int multiplication = multiplication(5, 10);
        System.out.println("Called multiplication method " + multiplication);

        int subtraction = subtraction(5, 10);
        System.out.println("Called subtraction method " + subtraction);

        int division = division(5, 10);
        System.out.println("Called division method " + division);

        int [] array = {1,2,3,4,5};
        int arraySum = calculateArraySum(array);
        System.out.println("array Sum is : " + arraySum);

        Sample s1 = new Sample();
        System.out.println(s1);

        System.out.println("MathOpration Sum is : " + MathOpration.addition(2,5));
        System.out.println("MathOpration Sum is : " + MathOpration.subtraction(2,5));
    }

    static void myMethod() {
        System.out.println("You are in myMthod");
    }

    static void myMethod(String p1) {
        System.out.println("You are in myMthod with paramers as " + p1);
    }

    static  int addition(int a, int b) {
        return a + b;
    }

    static  int subtraction(int a, int b) {
        return a - b;
    }

    static  int multiplication(int a, int b) {
        return a * b;
    }

    static  int division(int a, int b) {
        return a / b;
    }

    static int calculateArraySum(int [] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

}
