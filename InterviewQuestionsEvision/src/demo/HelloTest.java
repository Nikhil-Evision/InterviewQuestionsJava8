package demo;

public class HelloTest extends Test{
    public HelloTest(int i, String name) {
        super(i, name);
    }

    public static void main(String[] args) {

        Test t = new HelloTest(10,"Nikhil ");
        System.out.println(Test.name);
        System.out.println(Test.i);


    }
}
