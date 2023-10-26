package seminar7.Calculate;

public class OperationPlus extends OperationDecorator {

    Complex number;

    public OperationPlus(ICalculate calculate, Complex number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public Complex getComplex() {
        double newReal = this.number.getReal() + super.getComplex().getReal();
        double newImaginary = this.number.getImaginary() + super.getComplex().getImaginary();
        return new Complex(newReal, newImaginary);
    }
   
}
