package pltesterkrk3.skok;


public class Loops {
    public static void main(String[] args) {
        int[] liczby = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        //Wszystk ie pary liczb
        //ktorych suma daje 3
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby.length; j++) {
                if (i == j) {
                    continue;
                }

                if (liczby[i] + liczby[j] == 3) {
                    System.out.println(liczby[i]
                            + " " + liczby[j]);
                }
            }
        }
    }
}