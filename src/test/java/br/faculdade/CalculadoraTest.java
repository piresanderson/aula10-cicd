package br.faculdade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

  private final Calculadora calc = new Calculadora();

  @Test
  void deveSomar() {
    assertEquals(6, calc.somar(2, 3));
  }

  @Test
  void deveSubtrair() {
    assertEquals(1, calc.subtrair(3, 2));
  }

  @Test
  void deveLancarErroAoDividirPorZero() {
    assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
  }
}
