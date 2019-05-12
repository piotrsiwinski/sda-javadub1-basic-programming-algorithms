package pl.sda.dublin.strukturydanych;

import pl.sda.dublin.comparator.Person;

public class Stos<E extends Person> {

  private int index = 0;
  private Object[] elements;

  public Stos(int size) {
    elements = new Object[size];
  }

  public void push(E element) {


    // wyrzuć wyjątek - wypisac komunikat, ze stos pelny
    // jezeli index jest mniejszy od dlugosci tablicy - to mozemy wstawic nowy element
    // sprawdzamy, czy stos nie jest pelny
    // sprawdzamy, czy jest wolne miejsce na stosie
    // nie mozemy dodac na stos, jesli jest pelny
    if (index < elements.length) {
      elements[index] = element;
      index++;
    } else {
      System.out.println("Przepelniony stos");
    }
  }

  // zaimplementuj metode zdejomowania elementu ze stosu
  // przetestuj dzialanie

  @SuppressWarnings("unchecked")
  public E pop() {
    // kiedy ta operacja moze sie nie udac? kiedy stos jest pusty
    // nie mozemy pobierac elementu z pustego stosu
    // napiszmy warunek sprawdzajacy czy stos jest pusty
    if (index == 0) {
      // jesli stos pusty - nie mozemy zdjac
      System.out.println("Stos pusty - nie mozna zdjac elementu");
      return null;
    } else {
      // jesli znajdujemy sie w else -> stos zawiera conajmniej 1 element; stos nie pusty
      index--;
      // teraz index pokazuje na pierwsze zajęte miejsce
      // pobierz szczytowy element
      //      int element = nazwaTablicy[4];
      E element = (E) elements[index];
      elements[index] = null;
      return element;
    }
  }
  // nadpisz metodę toString() aby zwrocic reprezentacje stosu (wypisac jego elementy)

  @Override
  public String toString() {
    if (index == 0) {
      return "Pusty stos";
    }
    StringBuilder builder = new StringBuilder();
    builder.append("[\n");
    for (int i = index - 1; i >= 0; i--) {
      builder.append(elements[i]).append("\n");
    }

    builder.append("]");
    return builder.toString();
  }
}
