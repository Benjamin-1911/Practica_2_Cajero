package models.strategies;

public class SinComision implements ComisionStrategy {
    @Override
    public double aplicarComision(double monto) {
        return monto;
    }
}