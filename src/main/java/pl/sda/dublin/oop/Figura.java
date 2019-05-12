package pl.sda.dublin.oop;

public abstract class Figura {

    private String imie;


    public abstract double obliczPole();

    public abstract double obliczObwod();

    public double podajIloscLiterWNazwie(){
        return obliczObwod();
    }

}


// zdefiniuj klasy Figura i dziedziczace Prostokat i Kwadrat
// Figura powinna miec metody: obliczPole i obliczObwod
// Zaimplementuj metody i utworz przykladowe obiekty
// Wywolaj metody tych obiektow
