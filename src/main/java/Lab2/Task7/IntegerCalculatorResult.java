package Lab2.Task7;

public class IntegerCalculatorResult extends CalculatorResult {
    public IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Object computeResult() {
        int leftOperand = (Integer) calculatorRequest.getLeftOperand();
        int rightOperand = (Integer) calculatorRequest.getRightOperand();
        String operation = calculatorRequest.getOperation();

        switch (operation) {
            case "+":
                return  leftOperand + rightOperand;
            case "-":
                return leftOperand - rightOperand;
            case "*":
                return leftOperand * rightOperand;
            case "/":
                return leftOperand / rightOperand;
            default:
                throw new IllegalArgumentException("Unsupported operation for IntegerCalculatorResult");
        }
    }
}
