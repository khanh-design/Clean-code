package caculator;

public class Caculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int caculate(int firstOperator, int SecondOperator, char Operator) {
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
                    throw new ArithmeticException("Division by sero");
                }
            default:
                throw new ArithmeticException("Unssuprot Operation");
        }
    }
}
