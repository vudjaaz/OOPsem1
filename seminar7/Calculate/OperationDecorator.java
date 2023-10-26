package seminar7.Calculate;

public abstract class OperationDecorator implements ICalculate {

    ICalculate calculate;

    public OperationDecorator(ICalculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public Complex getComplex() {
        return calculate.getComplex();
    }

    
    
}
