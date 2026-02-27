package models.strategies;

import java.time.LocalTime;

public class ComisionSelector {

    public static ComisionStrategy obtenerEstrategia() {

        LocalTime ahora = LocalTime.now();

        if (ahora.isAfter(LocalTime.of(8,0)) &&
            ahora.isBefore(LocalTime.of(18,0))) {

            return new SinComision();
        }

        if (ahora.isAfter(LocalTime.of(18,0))) {
            return new ComisionNocturna();
        }

        return new ComisionMadrugada();
    }
}