package seminar7.Service;

import java.util.Scanner;

import seminar7.Calculate.Complex;
import seminar7.Calculate.MainCalculete;
import seminar7.Calculate.OperationDecorator;
import seminar7.Calculate.OperationDevide;
import seminar7.Calculate.OperationDif;
import seminar7.Calculate.OperationMulti;
import seminar7.Calculate.OperationPlus;

public class DataService {
    OperationDecorator operation;
    boolean stage;

    public DataService() {
        this.stage = true;
    }


    public Complex runCalculate(){
        while (stage) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Запуск калькулятора комплексных чисел");
            try {
                System.out.println("Введите действительную часть первого числа: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите мнимую часть первого числа: ");
                double num2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите действительную часть второго числа: ");
                double num3 = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите мнимую часть второго числа: ");
                double num4 = Double.parseDouble(scanner.nextLine());
                
                System.out.println("Введите операцию: ");
                String op = scanner.nextLine();

                switch (op) {
                    case "+":
                            operation = new OperationPlus(new MainCalculete(new Complex(num1, num2)),new Complex(num3, num4));
                            return operation.getComplex();
                    case "-":
                            operation = new OperationDif(new MainCalculete(new Complex(num1, num2)),new Complex(num3, num4));
                            return operation.getComplex();
                    case "*":
                            operation = new OperationMulti(new MainCalculete(new Complex(num1, num2)),new Complex(num3, num4));
                            return operation.getComplex();
                    case "/":
                            operation = new OperationDevide(new MainCalculete(new Complex(num1, num2)),new Complex(num3, num4));
                            return operation.getComplex();                                                           
                
                    default:
                            throw new Exception(String.format("For input string: '%s'", op));
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Неверная операция.");
                continue;
             
            }
            
        }
        return null;
    }
    
}
