public class Utsagnslogikk {
    public static void main(String[] args) {
        boolean p = 3 > 1;
        boolean q = 1 > 2;
        boolean r = (p || q) ^ q;

        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = (p || q) ^ q = " + r);


    }
}