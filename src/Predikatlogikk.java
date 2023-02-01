public class Predikatlogikk {
    public static void main(String[] args) {
        int x = 11;
        boolean svar = predicate(x);
        System.out.println("Predicate(x) = x > 10, x=" + x);
        System.out.println(x + " > 10 = " + svar);
    }

    public static boolean predicate(int x){ // P(x) : ( x> 10)
        return x > 10;
    }
}
