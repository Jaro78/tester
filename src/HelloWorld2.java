import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args) {
        HelloWorld2 helloWorld1 = new HelloWorld2();
        helloWorld1.printHello();
    }

    private String getHelloMessage(int jezyk) {
        if (jezyk == 0) {
            return "Witaj Świecie!";
        } else if (jezyk == 1) {
            return "Hello world!";
        } else {
            return "Język nieznany!";

        }
    }

    private String getHelloMessageSwitch(String jezyk) {
        String powitanie;
        switch (jezyk) {
            case "pl":
                powitanie = "Witaj Świecie!";
                break;
            case "en":
                powitanie = "Hello world!";
                break;
            case "cs":
                powitanie = "cos";
                break;
            default:
                powitanie = "Język nieznany!";
        }
        return powitanie;
    }

    private boolean powitanieDluzszeNiz3(String powitanie) {
        String komunikat = (powitanie.length() > 3) ?
                "Wieksze" : "Mniejsze";

        System.out.println(komunikat);

        return powitanie.length() > 3;
    }

    private void printHello() {
        System.out.println("Prosze podaj slowo:");

        Scanner scanner = new Scanner(System.in);
        String wartoscUzytykownika = scanner.nextLine();

        if (powitanieDluzszeNiz3(wartoscUzytykownika)) {
            System.out.println("Twoje slowo [ " + wartoscUzytykownika + " ] jest dluzsze niz 3");
        } else {
            System.out.println("Twoje slowo [ " + wartoscUzytykownika + " ] jest krotsze niz 3");
        }
    }
}