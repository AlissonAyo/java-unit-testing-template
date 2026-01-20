package ec.espe.demo;

public class Propina {

  /**
   * TODO: Implementar la logica.
   * Reglas:
   *  - subtotal >= 0
   *  - porcentajePropina entre 0 y 100
   *  - total = subtotal + subtotal*(porcentaje/100)
   *  - si una regla no se cumple: lanzar IllegalArgumentException
   */
  public static double totalConPropina(double subtotal, double porcentajePropina) {
    if (subtotal < 0) {
      throw new IllegalArgumentException("Subtotal cannot be negative");
    }
    if (porcentajePropina < 0 || porcentajePropina > 100) {
      throw new IllegalArgumentException("Tip percentage must be between 0 and 100");
    }
    return subtotal + subtotal * (porcentajePropina / 100);
  }
}
