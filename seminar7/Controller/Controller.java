package seminar7.Controller;

import seminar7.Calculate.Complex;
import seminar7.Service.DataService;
import seminar7.View.ComplexView;

public class Controller {

    private final DataService dataService = new DataService();
    private final ComplexView complexView = new ComplexView();

    public void process(){
        Complex number = dataService.runCalculate();
        complexView.sendOnConsole(number);
    }
    
}
