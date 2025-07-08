public class panizMain {

    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            chart(a);
        }
    }

    public static void chart(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.print((a * i) + " ");
        }
        System.out.println();
    }
}

