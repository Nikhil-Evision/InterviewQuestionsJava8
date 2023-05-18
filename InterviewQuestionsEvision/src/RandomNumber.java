import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }
}
