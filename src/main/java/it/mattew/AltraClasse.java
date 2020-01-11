package it.mattew;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AltraClasse {


    public AltraClasse(DbHelper helper) {
        this.helper = helper;
    }

    private static final Logger logger = LoggerFactory.getLogger(AltraClasse.class);

    public double divisioneStupida(double dividend, double divisor) {
        logger.info("chiamato");

        if (divisor == 0) {
            logger.error("qualcuno ha passato uno zero,mbecille ");
            throw new IllegalArgumentException("Ohibò, acciderbolina, mi hai passato uno Zero!");
        }
        return dividend / divisor;
    }
}
