import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1000);
        System.out.println("Random number: " + num);
        System.out.println("Random in decimal: " + Math.random());
    }
}
// another approach is using API(Appache Common langs)