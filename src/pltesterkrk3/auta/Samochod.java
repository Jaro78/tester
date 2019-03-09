package pltesterkrk3.auta;

public class Samochod {
    String identyfikator;
    int jazdyCounter = 0;
    int postojeCounter = 0;
    int skretyCounter = 0;

    public Samochod(String identyfikator) {
        this.identyfikator = identyfikator;
    }

   public void jedz() {
        jazdyCounter++;
    }

    public void stoj() {
        postojeCounter++;
    }

    public void skrec() {
        skretyCounter++;

    }
    public int getjazdy(){
        return jazdyCounter;

    }
    public  int getpostoje(){
        return postojeCounter;
    }

    public int getskrec() {
        return jazdyCounter;
    }

    void zatankuj() {

    }

    public String getindentyfikator() {
        return identyfikator;
    }


    public String wersja() {
        return "wersja nieznany";
    }

    public String toString (){
        return getindentyfikator() + "jazdy: " + getjazdy()
                + "postoje:" + getpostoje()
                + "skrec" +getpostoje();
        }


}
