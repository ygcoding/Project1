public class Driver {
    public static void main(String[] args) {
        Book x = new Book("Tom Sawyer", 191);
        Book y = new Book("Crime and punishment", 672);
        Book z = new Book("War and peace", 1300);
        System.out.println(x);
        x.parity();
        System.out.println(y);
        y.parity();
        System.out.println(z);
        z.parity();
    }
}

