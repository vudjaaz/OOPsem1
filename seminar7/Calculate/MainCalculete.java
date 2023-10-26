package seminar7.Calculate;

public class MainCalculete implements ICalculate {

    Complex number;

    public MainCalculete(Complex number) {
        this.number = number;
    }

    @Override
    public Complex getComplex() {
        return this.number;
    }
 
}
