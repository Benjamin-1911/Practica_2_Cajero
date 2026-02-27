package models.strategies;

public class ComisionNocturna implements ComisionStrategy {
    @Override
    public double aplicarComision(double monto) {
        return monto * 1.02;
    }
}