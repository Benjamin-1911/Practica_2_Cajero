package models.strategies;

public class ComisionMadrugada implements ComisionStrategy {
    @Override
    public double aplicarComision(double monto) {
        return monto + 3;
    }
}