public class Calculadora {

    public double adicionar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }

        return a / b;
    }

    public double sen(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }
}