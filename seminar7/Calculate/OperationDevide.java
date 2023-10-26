package seminar7.Calculate;

public class OperationDevide extends OperationDecorator{

    Complex number;

    public OperationDevide(ICalculate calculate, Complex number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public Complex getComplex() {
        double denominator = Math.pow(super.getComplex().getReal(), 2) + Math.pow(super.getComplex().getImaginary(), 2);
        double newReal = (this.number.getReal() * super.getComplex().getReal() +
                this.number.getImaginary() * super.getComplex().getImaginary()) / denominator;
        double newImaginary = (this.number.getImaginary() * super.getComplex().getReal() -
                this.number.getReal() * super.getComplex().getImaginary()) / denominator;
        return new Complex(newReal, newImaginary);
    }

    
    
}
