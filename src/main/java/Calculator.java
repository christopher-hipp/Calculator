interface CalculatorInterface {
    public double addition(double value1, double value2);
    public double subtraction(double value1, double value2);
    public double multiplication(double value1, double value2);
    public double division(double value1, double value2);
}

public class Calculator implements CalculatorInterface {
    private double result;

    public Calculator() {
        this.result = 0;
    }

    @Override
    public double addition(double value1, double value2) {
        result = value1 + value2;
        return result;
    }

    @Override
    public double subtraction(double value1, double value2) {
        result = value1 - value2;
        return result;
    }

    @Override
    public double multiplication(double value1, double value2) {
        result = value1 * value2;
        return result;
    }

    @Override
    public double division (double value1, double value2) {
        result = value1 / value2;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value1 = 10;
        int value2 = 5;

        System.out.println("Example: ");
        System.out.printf("%s plus %s equals %s\n", value1, value2, calculator.addition(value1, value2));
        System.out.printf("%s minus %s equals %s\n", value1, value2, calculator.subtraction(value1, value2));
        System.out.printf("%s times %s equals %s\n", value1, value2, calculator.multiplication(value1, value2));
        System.out.printf("%s divided by %s equals %s\n", value1, value2, calculator.division(value1, value2));
    }
}

