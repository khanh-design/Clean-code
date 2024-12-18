package Test_Drive_Development;

public class simpleCaculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int caculator(int firstOperator, int SecondOperator, char Operator) {
        switch (Operator) {
            case ADDITION:
                return firstOperator + SecondOperator;
            case SUBTRACTION:
                return firstOperator - SecondOperator;
            case MULTIPLICATION:
                return firstOperator * SecondOperator;
            case DIVISION:
                if (SecondOperator != 0) {
                    return firstOperator / SecondOperator;
                } else {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
            default:
                throw new UnsupportedOperationException("Support Operator");
        }
    }

}
