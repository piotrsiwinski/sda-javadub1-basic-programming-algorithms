package pl.sda.dublin.strukturydanych;

public class StosProgram {
  public static void main(String[] args) {

    Stos<String> stos = new Stos<>(3);
    System.out.println(stos);
    stos.push("A");
    stos.push("B");
    stos.push("C");

  }
}
