package seminar7.View;

import java.util.logging.Logger;

import seminar7.Calculate.Complex;

public class ComplexView {

    Logger logger = Logger.getLogger(Complex.class.getName());

    public void sendOnConsole(Complex number){
        logger.info(number.toString());
    }
    
}
