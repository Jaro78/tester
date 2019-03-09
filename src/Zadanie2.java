import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Zadanie2 zadanie = new Zadanie2();
        int cyfra = zadanie.czytajWejscie();
        zadanie.sprawdzCyfry(cyfra);
    }
    private int czytajWejscie () {
        System.out.println( "Podaj cyfre");
        Scanner scanner = new Scanner( System. in) ;
        if (scanner.hasNextInt()) {
                return Integer.parseInt(scanner.nextLine());
    } else {
            return -1;
        }

    }

    private void sprawdzCyfry(int cyfra) {
        if (cyfra >= 0 && cyfra <= 9) {
            switch (cyfra) {
                case 3:
                case 5:
                    System.out.println("Cyfra specjalna");
                    break;
                default:
                    System.out.println(" Cyfra zwyczjana");
            }
        } else{
            System.out.println("Niepoprawna wartosc");
        }
    }
}


