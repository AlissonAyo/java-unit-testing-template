public class Propina {

  /**
   * Calcula el total a pagar incluyendo propina.
   *
   * Reglas:
   *  - subtotal >= 0
   *  - porcentajePropina entre 0 y 100 (incluidos)
   *  - total = subtotal + subtotal*(porcentaje/100)
   *  - si una regla no se cumple: lanzar IllegalArgumentException
   */
  public static double totalConPropina(double subtotal, double porcentajePropina) {

    if (subtotal < 0) {
      throw new IllegalArgumentException("El subtotal no puede ser negativo");
    }

    if (porcentajePropina < 0 || porcentajePropina > 100) {
      throw new IllegalArgumentException("El porcentaje de propina debe estar entre 0 y 100");
    }

    return subtotal + subtotal * (porcentajePropina / 100.0);
  }
}

