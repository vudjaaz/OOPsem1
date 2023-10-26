package seminar7.Calculate;

public class OperationDif extends OperationDecorator {

    Complex number;

    public OperationDif(ICalculate calculate, Complex number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public Complex getComplex() {
        double newReal = this.number.getReal() - super.getComplex().getReal();
        double newImaginary = this.number.getImaginary() - super.getComplex().getImaginary();
        return new Complex(newReal, newImaginary);
    }

    
}
