package abstracts.interfaces;

public class ChildCircleClass extends CircleClass {
    public static void main(String[] args) {
        CircleClass redCircle = new ChildCircleClass();
        redCircle.setColor("RED");
        redCircle.isValid();
    }
}
