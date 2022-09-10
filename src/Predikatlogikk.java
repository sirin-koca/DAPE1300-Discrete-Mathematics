public class Predikatlogikk {
    public static void main(String[] args) {
        int n = 11;
        boolean svar = p(n);
        System.out.println(n + " > 10 = " + svar);
    }

    public static boolean p(int x){ // P(x) : ( x> 10)
        return x > 10;
    }
}
