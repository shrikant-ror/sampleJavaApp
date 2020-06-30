package academy.learnprogramming;

public class OuterClass {

    public  static void main(String[] args) {
        SuperClass supClass = new SuperClass();
        System.out.println("NUM1" + supClass.num1);

        SuperClass.SubClass subClass = supClass.new SubClass();
        System.out.println("NUM2" + subClass.num2);
    }
}

class SuperClass {
    int num1 = 20;

    class SubClass {
        int num2 = 30;
    }
}
