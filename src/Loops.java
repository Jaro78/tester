public class Loops {
    public static void main(String[] args) {
        int[] liczby = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
    }
}
