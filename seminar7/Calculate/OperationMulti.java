package seminar7.Calculate;

public class OperationMulti extends OperationDecorator {

    Complex number;

    public OperationMulti(ICalculate calculate, Complex number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public Complex getComplex() {
        double newReal = this.number.getReal() * super.getComplex().getReal() -
                this.number.getImaginary() * super.getComplex().getImaginary();
        double newImaginary = this.number.getReal() * super.getComplex().getImaginary() +
                this.number.getImaginary() * super.getComplex().getReal();
        return new Complex(newReal, newImaginary);

    
    }
}
