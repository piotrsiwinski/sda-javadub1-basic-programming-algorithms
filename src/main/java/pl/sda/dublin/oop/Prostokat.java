package pl.sda.dublin.oop;

public class Prostokat extends Figura {
  private double a;
  private double b;

  public Prostokat(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double obliczPole() {
    return a * b;
  }

  public double obliczObwod() {
    return 2 * a + 2 * b;
  }
}
