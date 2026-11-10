package br.faculdade;

/** Calculadora simples para demonstrar a pipeline de CI. */
public class Calculadora {

  public int somar(int a, int b) {
    return a + b;
  }

  public int subtrair(int a, int b) {
    return a - b;
  }

  public int dividir(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Divisão por zero");
    }
    return a / b;
  }
}
