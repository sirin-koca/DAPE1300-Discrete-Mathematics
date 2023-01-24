import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        x = Math.ceil(x);
        System.out.println("The result of Math.ceil for 3.14: " + x);

        double y = 3.14;
        y = Math.floor(y);
        System.out.println("The result of Math.floor for 3.14: " + y);

        int z = (int)y;
        System.out.println("The result of casting double to integer is: " + z);

        // Generating random double
        double a = Math.random();
        System.out.println("A random double: " + a);

        // Generating random integer
        Random ran = new Random(); // creating Random object
        System.out.println(ran.nextInt());

        // Math min - max
        int nr1 = 1043553;
        int nr2 = 2034534;
        int biggest = Math.max(nr1, nr2);
        int smallest = Math.min(nr1, nr2);
        System.out.println("The max-nr is: " + biggest + ", and the min nr is: " + smallest);


    }
}
