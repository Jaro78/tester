package pltesterkrk3;

public class Loops {
    public static void main(String[] args) {
        int[] liczby = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
        for(int liczba : liczby) {
            if (liczba % 2==0){
                System.out.println(liczba);

            }
            int i=0;
            while (i<liczby.length){
                if (liczby [i] % 2==0){
                    System.out.println(liczby[i]);
                }
                i++;
            }while (i<liczby.length);
        }
    }

}
