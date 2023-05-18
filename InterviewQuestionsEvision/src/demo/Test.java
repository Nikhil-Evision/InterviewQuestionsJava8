package demo;

public  abstract class Test {

    static int i;
    static String name;

    public void printIt(){
        System.out.println("Concrete methods ");
    }

    public Test(int i,String name) {
        this.i = i;
        this.name =name;

    }

}

