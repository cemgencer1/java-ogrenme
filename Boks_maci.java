public class Boks_maci {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 20);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 35);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}
